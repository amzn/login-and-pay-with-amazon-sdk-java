package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundDetails"
})
@XmlRootElement(name = "RefundResult")
public class RefundResult {

    @XmlElement(name = "RefundDetails", required = true)
    protected RefundDetails refundDetails;

    public RefundResult() {
        super();
    }

    public RefundDetails getRefundDetails() {
        return refundDetails;
    }


}
