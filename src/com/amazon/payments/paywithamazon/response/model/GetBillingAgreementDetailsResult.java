package com.amazon.payments.paywithamazon.response.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billingAgreementDetails"
})
@XmlRootElement(name = "GetBillingAgreementDetailsResult")
public class GetBillingAgreementDetailsResult {

    @XmlElement(name = "BillingAgreementDetails")
    protected BillingAgreementDetails billingAgreementDetails;

    public GetBillingAgreementDetailsResult() {
        super();
    }

    public BillingAgreementDetails getBillingAgreementDetails() {
        return billingAgreementDetails;
    }




}
