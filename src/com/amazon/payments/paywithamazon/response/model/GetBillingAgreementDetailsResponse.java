package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBillingAgreementDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetBillingAgreementDetailsResponse")
public class GetBillingAgreementDetailsResponse {

    @XmlElement(name = "GetBillingAgreementDetailsResult", required = true)
    protected GetBillingAgreementDetailsResult getBillingAgreementDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public GetBillingAgreementDetailsResponse() {
        super();
    }

    public GetBillingAgreementDetailsResult getGetBillingAgreementDetailsResult() {
        return getBillingAgreementDetailsResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

}
