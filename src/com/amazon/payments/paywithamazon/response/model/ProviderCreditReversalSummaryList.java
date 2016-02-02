package com.amazon.payments.paywithamazon.response.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderCreditReversalSummaryList", propOrder = {
    "member"
})
public class ProviderCreditReversalSummaryList {

    @XmlElement(required = true)
    protected List<ProviderCreditReversalSummary> member;

    public ProviderCreditReversalSummaryList() {
        super();
    }

    public List<ProviderCreditReversalSummary> getMember() {
        if (member == null) {
            member = new ArrayList<ProviderCreditReversalSummary>();
        }
        return this.member;
    }

}
