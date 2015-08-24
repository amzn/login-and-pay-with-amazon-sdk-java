/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PayWithAmazon.Request;

import java.util.*;

/**
 * https://payments.amazon.com/documentation/apireference/201751630#201752040
 * @author nehaa
 */
public class CaptureRequest {
    
    private Map<String,String> parameters = new HashMap<String,String>();

    private String amazonOrderReferenceId = null;  
    private String captureReferenceId = null;
    private String captureAmount = null;
    private String sellerCaptureNote = null;
    private String softDescriptor = null;
    private String mwsAuthToken = null;   


    /**
     * Set the value of sellerAuthorizationNote
     *
     * @param amazonOrderReferenceId new value of sellerAuthorizationNote
     */
    public CaptureRequest setAmazonOrderReferenceId(String amazonOrderReferenceId){
        this.amazonOrderReferenceId = amazonOrderReferenceId;
        parameters.put(ParamConstants.AMAZON_ORDER_REFERENCE_ID, amazonOrderReferenceId);
        return this;
    }
    
    /**
     * Set the value of captureReferenceId
     *
     * @param captureReferenceId new value of captureReferenceId
     */
    public CaptureRequest setCaptureReferenceId(String captureReferenceId) {
        this.captureReferenceId = captureReferenceId;
        parameters.put( ParamConstants.CAPTURE_REFERENCE_ID , captureReferenceId );
        return this;
    }

    /**
     * Set the value of captureAmount
     *
     * @param captureAmount new value of captureAmount
     */
    public CaptureRequest setCaptureAmount(String captureAmount) {
        this.captureAmount = captureAmount;
        parameters.put( ParamConstants.CAPTURE_AMOUNT , captureAmount );
        return this;
    }

    /**
     * Set the value of sellerCaptureNote
     *
     * @param sellerCaptureNote new value of sellerCaptureNote
     */
    public CaptureRequest setSellerCaptureNote(String sellerCaptureNote) {
        this.sellerCaptureNote = sellerCaptureNote;
        parameters.put( ParamConstants.CAPTURE_NOTE , sellerCaptureNote );
        return this;
    }
    
    
    /**
     * Set the value of softDescriptor
     *
     * @param softDescriptor new value of softDescriptor
     */
    public CaptureRequest setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
        parameters.put( ParamConstants.SOFT_DESCRIPTOR , softDescriptor );
        return this;
    }
    
    /**
     * Set the value of mwsAuthToken
     *
     * @param mwsAuthToken new value of mwsAuthToken
     */
    public CaptureRequest setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        parameters.put(ParamConstants.MWS_AUTH_TOKEN, mwsAuthToken);
        return this;
    }
    
    public Map<String,String> getParamMap(){
        return parameters;
        
    }
    
}