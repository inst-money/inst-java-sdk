package com.inst.money.openapi.dto;

import com.alibaba.fastjson.JSONObject;

import java.util.TreeMap;

public class PaymentReq {

    private String currency;

    private String amount;

    private String cust_order_id;

    private ReturnUrls return_urls;

    private Customer customer;


    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getCust_order_id() {
        return cust_order_id;
    }


    public void setCust_order_id(String cust_order_id) {
        this.cust_order_id = cust_order_id;
    }

    public ReturnUrls getReturn_urls() {
        return return_urls;
    }


    public void setReturn_urls(ReturnUrls return_urls) {
        this.return_urls = return_urls;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
