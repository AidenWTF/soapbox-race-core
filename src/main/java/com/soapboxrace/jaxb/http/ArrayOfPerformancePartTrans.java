//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.14 at 11:58:37 AM EDT 
//


package com.soapboxrace.jaxb.http;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPerformancePartTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPerformancePartTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformancePartTrans" type="{}PerformancePartTrans" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerformancePartTrans", propOrder = {
    "performancePartTrans"
})
public class ArrayOfPerformancePartTrans {

    @XmlElement(name = "PerformancePartTrans", nillable = true)
    protected List<PerformancePartTrans> performancePartTrans;

    /**
     * Gets the value of the performancePartTrans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performancePartTrans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformancePartTrans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformancePartTrans }
     * 
     * 
     */
    public List<PerformancePartTrans> getPerformancePartTrans() {
        if (performancePartTrans == null) {
            performancePartTrans = new ArrayList<PerformancePartTrans>();
        }
        return this.performancePartTrans;
    }

}
