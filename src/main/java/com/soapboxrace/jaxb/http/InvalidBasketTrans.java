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
 * <p>Java class for InvalidBasketTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidBasketTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Basket" type="{}BasketTrans" minOccurs="0"/>
 *         &lt;element name="InvalidItems" type="{}ArrayOfInvalidBasketItemTrans" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidBasketTrans", propOrder = {
    "basket",
    "invalidItems"
})
public class InvalidBasketTrans {

    @XmlElement(name = "Basket")
    protected BasketTrans basket;
    @XmlElement(name = "InvalidItems")
    protected ArrayOfInvalidBasketItemTrans invalidItems;

    /**
     * Gets the value of the basket property.
     * 
     * @return
     *     possible object is
     *     {@link BasketTrans }
     *     
     */
    public BasketTrans getBasket() {
        return basket;
    }

    /**
     * Sets the value of the basket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketTrans }
     *     
     */
    public void setBasket(BasketTrans value) {
        this.basket = value;
    }

    /**
     * Gets the value of the invalidItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvalidBasketItemTrans }
     *     
     */
    public ArrayOfInvalidBasketItemTrans getInvalidItems() {
        return invalidItems;
    }

    /**
     * Sets the value of the invalidItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvalidBasketItemTrans }
     *     
     */
    public void setInvalidItems(ArrayOfInvalidBasketItemTrans value) {
        this.invalidItems = value;
    }

}
