package com.amazon.payments.paywithamazon.response.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderCreditSummary", propOrder = {
    "providerId",
    "providerCreditId"
})
public class ProviderCreditSummary {

    @XmlElement(name = "ProviderId", required = true)
    protected String providerId;
    @XmlElement(name = "ProviderCreditId", required = true)
    protected String providerCreditId;

    public ProviderCreditSummary() {
        super();
    }

    public String getProviderId() {
        return providerId;
    }
  
    public String getProviderCreditId() {
        return providerCreditId;
    }

}
