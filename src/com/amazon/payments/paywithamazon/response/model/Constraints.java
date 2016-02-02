package com.amazon.payments.paywithamazon.response.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Constraints", propOrder = {
    "constraint"
})
public class Constraints {

    @XmlElement(name = "Constraint", required = true)
    protected List<Constraint> constraint;

    public Constraints() {
        super();
    }

    public List<Constraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<Constraint>();
        }
        return this.constraint;
    }



}
