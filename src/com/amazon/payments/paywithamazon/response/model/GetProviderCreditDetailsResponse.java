package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProviderCreditDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetProviderCreditDetailsResponse")
public class GetProviderCreditDetailsResponse {

    @XmlElement(name = "GetProviderCreditDetailsResult", required = true)
    protected GetProviderCreditDetailsResult getProviderCreditDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public GetProviderCreditDetailsResponse() {
        super();
    }


    public GetProviderCreditDetailsResult getGetProviderCreditDetailsResult() {
        return getProviderCreditDetailsResult;
    }


    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }


}
