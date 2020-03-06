package com.qy.test.myTest;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/11.
 */
public class Test1 {
    public static void main(String[] args) {
        String ids = "111:1,111:3,111:2,111:5,111:6,111:4";
        String str = handleColumnSystemIds(ids);
        System.out.println(str);
    }
    public static void Demo(){

    }
    public static String handleColumnSystemIds(String ids) {
        if (ids == null || "".equalsIgnoreCase(ids)) {
            return "";
        }
        String[] split = ids.split(",");
        List<String> list = Lists.newArrayList();
        for (String id : split) {
            if(id.contains("_")){
                list.add(id);
                continue;
            }
            id = "_" + id + "_";
            list.add(id);
        }
        String arrStrIds1 = list.toString().replace("[", "");
        return arrStrIds1.replace("]", "").replace(" ","").trim();
    }
}
