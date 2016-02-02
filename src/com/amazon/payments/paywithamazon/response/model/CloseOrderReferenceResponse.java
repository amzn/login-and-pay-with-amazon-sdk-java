package com.amazon.payments.paywithamazon.response.model;

import com.amazon.payments.paywithamazon.response.model.ResponseMetadata;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "closeOrderReferenceResult",
    "responseMetadata"
})
@XmlRootElement(name = "CloseOrderReferenceResponse")
public class CloseOrderReferenceResponse {

    @XmlElement(name = "CloseOrderReferenceResult", required = true)
    protected CloseOrderReferenceResult closeOrderReferenceResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    
    public CloseOrderReferenceResponse() {
        super();
    }

    public CloseOrderReferenceResult getCloseOrderReferenceResult() {
        return closeOrderReferenceResult;
    }


    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }



    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @XmlRootElement(name = "CloseOrderReferenceResult")
    public static class CloseOrderReferenceResult {
        public CloseOrderReferenceResult() {
            super();
    }
    }
}
