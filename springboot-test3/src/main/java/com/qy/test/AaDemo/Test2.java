package com.qy.test.AaDemo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/10.
 */
public class Test2 {
    public static void main(String[] args) {
        String ids = "_111+1_,_111+2_";
        String str = removeColumnSystemIdsUnderLineByIds(ids);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(ids.length()-4);
    }

    public void Demo1(){
        for(int i =0;i<10;i++){
            System.out.println(i);
            if(i == 5)
                throw new NullPointerException();
        }
    }

    public static String removeColumnSystemIdsUnderLineByIds(String ids){
        if (ids == null || "".equalsIgnoreCase(ids)) {
            return "";
        }
        String[] split = ids.split(",");
        List<String> list = Lists.newArrayList();
        for(String id:split){
            String str = removeColumnSystemIdsUnderLine(id);
            list.add(str);
        }
        String removeStr = list.toString().replace("[","");
        return removeStr.replace("]","").trim().replace(" ","");
    }

    public static String removeColumnSystemIdsUnderLine(String id) {
        if (id == null || "".equalsIgnoreCase(id)) {
            return "";
        }
        return id.replace("_", "").trim();
    }

    public void judgeCase(int num){
        switch (num){
            case 0:
                System.out.println(0);
                break;
            case 2:
                break;

            default:
                System.out.println("moren");
                break;
        }
    }
}
