package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setOrderReferenceDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "SetOrderReferenceDetailsResponse")
public class SetOrderReferenceDetailsResponse {
    
    @XmlElement(name = "SetOrderReferenceDetailsResult", required = true)
    protected SetOrderReferenceDetailsResult setOrderReferenceDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;
    
    
    public SetOrderReferenceDetailsResponse() {
        super();
    }
    
    
    public SetOrderReferenceDetailsResult getSetOrderReferenceDetailsResult() {
        return setOrderReferenceDetailsResult;
    }
    
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    
}
