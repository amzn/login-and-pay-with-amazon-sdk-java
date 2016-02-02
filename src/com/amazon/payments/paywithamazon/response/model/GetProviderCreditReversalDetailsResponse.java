package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProviderCreditReversalDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetProviderCreditReversalDetailsResponse")
public class GetProviderCreditReversalDetailsResponse {

    @XmlElement(name = "GetProviderCreditReversalDetailsResult", required = true)
    protected GetProviderCreditReversalDetailsResult getProviderCreditReversalDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public GetProviderCreditReversalDetailsResponse() {
        super();
    }

    public GetProviderCreditReversalDetailsResult getGetProviderCreditReversalDetailsResult() {
        return getProviderCreditReversalDetailsResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }


}
