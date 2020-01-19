package com.test2;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class Test6 {

    public static void main(String[] args) {
        Map<String,String> map1 = Maps.newHashMap();
        Map<String,String> map2 = Maps.newHashMap();
        Map<String,String> map = Maps.newHashMap();

        List<String> list = Lists.newArrayList();

        map1.put("1","111");
        map2.put("2","222");

        String json1 = JSON.toJSONString(map1);
        String json2 = JSON.toJSONString(map2);
        list.add(json1);
        list.add(json2);


        System.out.println(list.toString());
    }

}
