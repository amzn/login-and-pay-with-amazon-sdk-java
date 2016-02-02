package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorizationDetails",
    "amazonOrderReferenceId"
})
@XmlRootElement(name = "AuthorizeOnBillingAgreementResult")
public class AuthorizeOnBillingAgreementResult {

    @XmlElement(name = "AuthorizationDetails", required = true)
    protected AuthorizationDetails authorizationDetails;
    @XmlElement(name = "AmazonOrderReferenceId", required = true)
    protected String amazonOrderReferenceId;

    public AuthorizeOnBillingAgreementResult() {
        super();
    }


    public AuthorizationDetails getAuthorizationDetails() {
        return authorizationDetails;
    }

    public String getAmazonOrderReferenceId() {
        return amazonOrderReferenceId;
    }


}
