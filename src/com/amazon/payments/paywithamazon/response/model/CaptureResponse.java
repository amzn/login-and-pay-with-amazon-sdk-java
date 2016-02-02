package com.amazon.payments.paywithamazon.response.model;

import com.amazon.payments.paywithamazon.response.model.ResponseMetadata;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "captureResult",
    "responseMetadata"
})
@XmlRootElement(name = "CaptureResponse")
public class CaptureResponse {

    @XmlElement(name = "CaptureResult", required = true)
    protected CaptureResult captureResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;
    
    public CaptureResponse() {
        super();
    }

    public CaptureResult getCaptureResult() {
        return captureResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "captureDetails"
    })
    @XmlRootElement(name = "CaptureResult")
    public static class CaptureResult {

        @XmlElement(name = "CaptureDetails", required = true)
        protected CaptureDetails captureDetails;

        public CaptureResult() {
            super();
        }

        public CaptureDetails getCaptureDetails() {
            return captureDetails;
        }
    }

}
