package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The total amount of an order represented by an Order Reference object.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTotal", propOrder = {
    "currencyCode",
    "amount"
})
public class OrderTotal {

    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Amount")
    protected String amount;

    public OrderTotal() {
        super();
    }

    /**
     * A three-digit currency code, formatted based on the ISO 4217 standard. 
     * 
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * The currency amount.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "OrderTotal{" + "currencyCode=" + currencyCode + ", amount=" + amount + '}';
    }


}