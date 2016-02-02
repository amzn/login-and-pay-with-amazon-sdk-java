package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validationResult",
    "failureReasonCode",
    "billingAgreementStatus"
})
@XmlRootElement(name = "ValidateBillingAgreementResult")
public class ValidateBillingAgreementResult {

    @XmlElement(name = "ValidationResult", required = true)
    protected RequestStatus validationResult;
    @XmlElement(name = "FailureReasonCode")
    protected String failureReasonCode;
    @XmlElement(name = "BillingAgreementStatus")
    protected BillingAgreementStatus billingAgreementStatus;

    public ValidateBillingAgreementResult() {
        super();
    }

    public RequestStatus getValidationResult() {
        return validationResult;
    }


    public String getFailureReasonCode() {
        return failureReasonCode;
    }


    public BillingAgreementStatus getBillingAgreementStatus() {
        return billingAgreementStatus;
    }


}
