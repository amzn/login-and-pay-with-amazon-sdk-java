package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validateBillingAgreementResult",
    "responseMetadata"
})
@XmlRootElement(name = "ValidateBillingAgreementResponse")
public class ValidateBillingAgreementResponse {

    @XmlElement(name = "ValidateBillingAgreementResult", required = true)
    protected ValidateBillingAgreementResult validateBillingAgreementResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public ValidateBillingAgreementResponse() {
        super();
    }

    public ValidateBillingAgreementResult getValidateBillingAgreementResult() {
        return validateBillingAgreementResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }


    

}
