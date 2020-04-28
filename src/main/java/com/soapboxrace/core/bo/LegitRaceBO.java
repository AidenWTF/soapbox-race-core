/*
 * This file is part of the Soapbox Race World core source code.
 * If you use any of this code for third-party purposes, please provide attribution.
 * Copyright (c) 2020.
 */

package com.soapboxrace.core.bo;

import com.soapboxrace.core.jpa.EventSessionEntity;
import com.soapboxrace.jaxb.http.ArbitrationPacket;
import com.soapboxrace.jaxb.http.PursuitArbitrationPacket;
import com.soapboxrace.jaxb.http.TeamEscapeArbitrationPacket;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class LegitRaceBO {

    @EJB
    private SocialBO socialBo;

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isLegit(Long activePersonaId, ArbitrationPacket arbitrationPacket,
                           EventSessionEntity sessionEntity) {
        long minimumTime = sessionEntity.getEvent().getLegitTime();
        final long timeDiff = sessionEntity.getEnded() - sessionEntity.getStarted();
        boolean legit = timeDiff >= minimumTime;

        if (!legit) {
            socialBo.sendReport(0L, activePersonaId, 3, String.format("Abnormal event time: %d", timeDiff),
                    (int) arbitrationPacket.getCarId(), 0, arbitrationPacket.getHacksDetected());
            return false;
        }

        if (arbitrationPacket.getHacksDetected() > 0) {
            socialBo.sendReport(0L, activePersonaId, 3, "hacksDetected > 0", (int) arbitrationPacket.getCarId(), 0,
                    arbitrationPacket.getHacksDetected());
            return false;
        }

        if (arbitrationPacket instanceof TeamEscapeArbitrationPacket) {
            TeamEscapeArbitrationPacket teamEscapeArbitrationPacket = (TeamEscapeArbitrationPacket) arbitrationPacket;

            if (teamEscapeArbitrationPacket.getFinishReason() != 8202) {
                return teamEscapeArbitrationPacket.getCopsDisabled() <= teamEscapeArbitrationPacket.getCopsDeployed();
            }
        }

        if (arbitrationPacket instanceof PursuitArbitrationPacket) {
            PursuitArbitrationPacket pursuitArbitrationPacket = (PursuitArbitrationPacket) arbitrationPacket;

            if (pursuitArbitrationPacket.getFinishReason() != 8202) {
                if (pursuitArbitrationPacket.getCopsDisabled() > pursuitArbitrationPacket.getCopsDeployed()) {
                    return false;
                }

                return pursuitArbitrationPacket.getTopSpeed() != 0 || pursuitArbitrationPacket.getInfractions() == 0;
            }
        }

        return true;
    }
}
