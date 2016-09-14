package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.AuthorizationDetails;
import com.amazon.payments.paywithamazon.response.model.AuthorizeOnBillingAgreementResponse;
import java.io.Serializable;

/**
 * Response from AuthorizeOnBillingAgreement service API, as returned by Amazon Payments
 */
public final class AuthorizeOnBillingAgreementResponseData  extends ResponseData implements Serializable {
    
    private String requestId;
    private String amazonOrderReferenceId;
    private AuthorizationDetails authorizationDetails;
    
    public AuthorizeOnBillingAgreementResponseData(AuthorizeOnBillingAgreementResponse authorizeOnBillingAgreementResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(authorizeOnBillingAgreementResponse != null) {
            if(authorizeOnBillingAgreementResponse.getAuthorizeOnBillingAgreementResult()!= null) {
                this.authorizationDetails = authorizeOnBillingAgreementResponse.getAuthorizeOnBillingAgreementResult().getAuthorizationDetails();
                this.amazonOrderReferenceId = authorizeOnBillingAgreementResponse.getAuthorizeOnBillingAgreementResult().getAmazonOrderReferenceId();
            }
            this.requestId = authorizeOnBillingAgreementResponse.getResponseMetadata().getRequestId();
        }
    }

    /**
     * The requestID that uniquely identifies the service request
     * the caller made.
     * 
     * @return  The requestID that uniquely identifies the service request
     * the caller made.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Returns the amazonOrderReferenceId
     * 
     * @return amazonOrderReferenceId
     */
    public String getAmazonOrderReferenceId() {
        return amazonOrderReferenceId;
    }


    
    /**
     * Encapsulates details about an Authorization object, 
     * including the status, amount captured, and fee charged.
     * Documentation: https://payments.amazon.com/documentation/apireference/201751630#201752450
     * 
     * @return authorizationDetails
     *
     */
    public AuthorizationDetails getDetails() {
        return authorizationDetails;
    }

    /**
     * Returns the string representation of AuthorizeOnBillingAgreementResponseData
     */
    @Override
    public String toString() {
        return "AuthorizeOnBillingAgreementResponseData{" + "requestId=" + requestId + ", amazonOrderReferenceId=" 
                + amazonOrderReferenceId + ", authorizationDetails=" + authorizationDetails.toString() + '}';
    }

    
    
}