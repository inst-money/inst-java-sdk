package com.inst.money.openapi;

import com.alibaba.fastjson.JSONObject;
import com.inst.money.openapi.util.HmacUtil;
import org.junit.Test;

import java.util.TreeMap;

/**
 * @author 
 * @date 6/27/21
 */
public class NotificationTest {
    @Test
    public void notificationTest() {
        //what you receive in header
        String timeStamp = "1585810920286";
        String signature = "01GGwidLw0UzcV0JUs3QkuHZo34jvOqtQZpavpABCLI=";
        //action, params and your secret
        String action = "kyc-status";
        String secret = "40e4cdb39f764ad48b0829e675b67b90";
        String params = "{\n" +
                "    \"action\": \"order_result\",\n" +
                "    \"events\": [\n" +
                "        \"{\\\"id\\\":\\\"bc76488ddda4\\\",\\\"create_time\\\":1585293811000,\\\"params\\\":{\\\"order_id\\\":\\\"1223\\\",\\\"status\\\":1}}\"\n" +
                "    ]\n" +
                "}";

        TreeMap<String, Object> treeMap = JSONObject.parseObject(params, TreeMap.class);
//        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
        //verify
        try {
            String sign = HmacUtil.sign(timeStamp, action, treeMap,secret);
            System.out.println(sign);
            if (sign.equals(signature)) {
                System.out.println("signature is right");
            }else {
                System.out.println("signature is wrong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
