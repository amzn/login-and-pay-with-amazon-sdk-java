package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRefundDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetRefundDetailsResponse")
public class GetRefundDetailsResponse {

    @XmlElement(name = "GetRefundDetailsResult", required = true)
    protected GetRefundDetailsResult getRefundDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    
    public GetRefundDetailsResponse() {
        super();
    }

    public GetRefundDetailsResult getGetRefundDetailsResult() {
        return getRefundDetailsResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }
   
}
