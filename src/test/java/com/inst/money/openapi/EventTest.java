package com.inst.money.openapi;

import com.alibaba.fastjson.JSON;
import com.inst.money.openapi.util.HttpUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventTest {

    String host = "https://api.sandbox.inst.money";
    private static final String apiKey = "59d07871c9cb4f5190ba468ea0a8b4ee";
    private static final String apiSecret = "6edadeb7-7d3e-4137-9e52-d51bdd381c2a";
    private static final String apiPassphrase = "12345678a";

    @Before
    public void setUp() throws Exception {
        HttpUtil.init(host,apiKey,apiSecret,apiPassphrase);
    }


    @Test
    public void pushEventsTest() throws Exception {
        String requestPath = "/api/v1/events/test";
        String requestQueryStr = "";
        Map req = new HashMap();
        HttpUtil.post(requestPath,requestQueryStr,req.toString());
    }



}
