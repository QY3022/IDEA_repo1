package com.test2;

import com.google.common.collect.Maps;

import java.util.Map;

public class test1 {
    public static void main(String[] args) {
        Map<String,Integer> map = Maps.newHashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.forEach((key,value) ->{
            System.out.println(key+"::::::"+value);
        });
    }
}
