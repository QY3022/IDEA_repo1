package com.qy.test.AaDemo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/20.
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "_111:1_,_222:2_,_333+1_";
        System.out.println(removeColumnSystemIdsUnderLineByIds(str));

    }


    public static String removeColumnSystemIdsUnderLineByIds(String ids){
        if (ids == null || "".equalsIgnoreCase(ids)) {
            return "";
        }
        String[] split = ids.split(",");
        List<String> list = Lists.newArrayList();
        for(String id:split){
            String str = id.replace("_", "").trim();
            list.add(str);
        }
        String removeStr = list.toString().replace("[","");
        return removeStr.replace("]","").replace(" ","").trim();
    }
}
