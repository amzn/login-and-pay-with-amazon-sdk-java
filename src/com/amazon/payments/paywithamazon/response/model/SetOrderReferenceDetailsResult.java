package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderReferenceDetails"
})
@XmlRootElement(name = "SetOrderReferenceDetailsResult")
public class SetOrderReferenceDetailsResult {

    @XmlElement(name = "OrderReferenceDetails")
    protected OrderReferenceDetails orderReferenceDetails;

    public SetOrderReferenceDetailsResult() {
        super();
    }

    public OrderReferenceDetails getOrderReferenceDetails() {
        return orderReferenceDetails;
    }

}
