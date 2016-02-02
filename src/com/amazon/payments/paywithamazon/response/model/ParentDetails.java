package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentDetails", propOrder = {
    "id",
    "type"
})
public class ParentDetails {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Type", required = true)
    protected Type type;

    public ParentDetails() {
        super();
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

}
