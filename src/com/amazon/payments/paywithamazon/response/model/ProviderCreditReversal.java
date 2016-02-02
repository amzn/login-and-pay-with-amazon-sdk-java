package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderCreditReversal", propOrder = {
    "providerId",
    "creditReversalAmount"
})
public class ProviderCreditReversal {

    @XmlElement(name = "ProviderId", required = true)
    protected String providerId;
    @XmlElement(name = "CreditReversalAmount", required = true)
    protected Price creditReversalAmount;

    /**
     * Default constructor
     * 
     */
    public ProviderCreditReversal() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public ProviderCreditReversal(final String providerId, final Price creditReversalAmount) {
        this.providerId = providerId;
        this.creditReversalAmount = creditReversalAmount;
    }

    public String getProviderId() {
        return providerId;
    }

    public Price getCreditReversalAmount() {
        return creditReversalAmount;
    }

    @Override
    public String toString() {
        return "ProviderCreditReversal{" + "providerId=" + providerId + ", creditReversalAmount=" + creditReversalAmount.toString() + '}';
    }



}
