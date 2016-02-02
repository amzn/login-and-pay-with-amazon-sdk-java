package com.amazon.payments.paywithamazon.response.model;

import com.amazon.payments.paywithamazon.response.model.ResponseMetadata;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAuthorizationDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetAuthorizationDetailsResponse")
public class GetAuthorizationDetailsResponse {

    @XmlElement(name = "GetAuthorizationDetailsResult", required = true)
    protected GetAuthorizationDetailsResult getAuthorizationDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    
    public GetAuthorizationDetailsResponse() {
        super();
    }

    public GetAuthorizationDetailsResult getGetAuthorizationDetailsResult() {
        return getAuthorizationDetailsResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
       "authorizationDetails"
    })
    @XmlRootElement(name = "GetAuthorizationDetailsResult")
    public static class GetAuthorizationDetailsResult {

        @XmlElement(name = "AuthorizationDetails", required = true)
        protected AuthorizationDetails authorizationDetails;

        public GetAuthorizationDetailsResult() {
            super();
        }

        public AuthorizationDetails getAuthorizationDetails() {
            return authorizationDetails;
        }
}
    
}
