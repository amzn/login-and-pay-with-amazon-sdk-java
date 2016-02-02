package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundResult",
    "responseMetadata"
})
@XmlRootElement(name = "RefundResponse")
public class RefundResponse {

    @XmlElement(name = "RefundResult", required = true)
    protected RefundResult refundResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    
    public RefundResponse() {
        super();
    }

    public RefundResult getRefundResult() {
        return refundResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }


}
