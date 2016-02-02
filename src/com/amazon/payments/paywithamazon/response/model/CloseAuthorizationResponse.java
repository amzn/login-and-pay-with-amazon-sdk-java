package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "closeAuthorizationResult",
    "responseMetadata"
})
@XmlRootElement(name = "CloseAuthorizationResponse")
public class CloseAuthorizationResponse {

    @XmlElement(name = "CloseAuthorizationResult", required = true)
    protected CloseAuthorizationResult closeAuthorizationResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;
    
    public CloseAuthorizationResponse() {
        super();
    }

    public CloseAuthorizationResult getCloseAuthorizationResult() {
        return closeAuthorizationResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }
}
