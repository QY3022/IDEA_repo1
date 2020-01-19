package com.gyf.TestJson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class foreach {
    public static void main(String[] args) {
        Map<String,String> voMap = new HashMap<>();
        voMap.put("type","1");
        voMap.put("ss","sss");

        String type = voMap.get("type");
        System.out.println(type);

    }
}
