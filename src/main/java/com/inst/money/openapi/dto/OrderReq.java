package com.inst.money.openapi.dto;

import com.alibaba.fastjson.JSONObject;

public class OrderReq {

    private String currency;

    private String amount;

    private String cust_order_id;


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

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
