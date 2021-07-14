package com.inst.money.openapi;


import com.inst.money.openapi.dto.OrderReq;
import com.inst.money.openapi.util.HttpUtil;


import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

/**
 * @author
 * @version 1.0
 * @date 2021/07/11
 */
public class FiatOrderTest {



    String host = "https://api.sandbox.inst.money";
    private static final String apiKey = "ddb2e451f9534b61a3476f6f4316087e";
    private static final String apiSecret = "d9241402-99b0-4736-b592-6cf046c7af63";
    private static final String apiPassphrase = "12345678a";


    @Before
    public void setUp() throws Exception {
        HttpUtil.init(host,apiKey,apiSecret,apiPassphrase);
    }

    @Test
    public void postOrderReqTest() throws Exception {

        String requestPath = "/api/v1/order";
        String requestQueryStr = "";

        OrderReq req = new OrderReq();
        req.setCurrency("USD");
        req.setAmount("2");
        req.setCust_order_id(UUID.randomUUID().toString());
//        req.setCust_order_id("1234560018");
        HttpUtil.post(requestPath,requestQueryStr,req.toString());
    }

    @Test
    public void getCardsTest() throws Exception {
        String requestPath = "/api/v1/rates";
        String requestQueryStr = "from_currency=USD&to_coin=BTC";
        HttpUtil.get(requestPath,requestQueryStr);
    }

}
