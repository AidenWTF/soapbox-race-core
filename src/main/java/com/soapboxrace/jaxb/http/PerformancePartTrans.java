//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.14 at 11:58:37 AM EDT 
//


package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformancePartTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformancePartTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformancePartAttribHash" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformancePartTrans", propOrder = {
    "performancePartAttribHash"
})
public class PerformancePartTrans {

    @XmlElement(name = "PerformancePartAttribHash")
    protected int performancePartAttribHash;

    /**
     * Gets the value of the performancePartAttribHash property.
     * 
     */
    public int getPerformancePartAttribHash() {
        return performancePartAttribHash;
    }

    /**
     * Sets the value of the performancePartAttribHash property.
     * 
     */
    public void setPerformancePartAttribHash(int value) {
        this.performancePartAttribHash = value;
    }

}
