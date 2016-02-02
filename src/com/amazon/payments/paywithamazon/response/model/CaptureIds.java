package com.amazon.payments.paywithamazon.response.model;



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaptureIds", propOrder = {
    "member"
})
public class CaptureIds {

    @XmlElement(required = true)
    protected List<String> member;

    public CaptureIds() {
        super();
    }


    public List<String> getMember() {
        if (member == null) {
            member = new ArrayList<String>();
        }
        return this.member;
    }

    @Override
    public String toString() {
        return "CaptureIds{" + "member=" + member.toString() + '}';
    }


 
}
