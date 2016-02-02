package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents the address selected by the buyer through the AddressBook widget.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destination", propOrder = {
    "destinationType",
    "physicalDestination"
})
public class Destination {

    @XmlElement(name = "DestinationType")
    protected String destinationType;
    @XmlElement(name = "PhysicalDestination")
    protected Address physicalDestination;

    public Destination() {
        super();
    }

    /**
     * Returns destination type. Allowed value: Physical
     * 
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * The address of the destination. Type: Address
     * 
     * @return physicalDestination
     */
    public Address getPhysicalDestination() {
        return physicalDestination;
    }

    @Override
    public String toString() {
        return "Destination{" + "destinationType=" + destinationType + ", physicalDestination=" + physicalDestination.toString() + '}';
    }

    
}
