package com.qy.test;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author by QY3022
 * @date 2020/1/17.
 */
public class Test {
    public static void main(String[] args) {
        String str = "123";
        String format = String.format("%s ,sdada", str);
        System.out.println(format);

        List<String> arr = Lists.newArrayList();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("---- ---- ---- ----");
        //1 --> 001
        System.out.println(1>>2);
        System.out.println(1<<2);
        System.out.println(1>>1);
        System.out.println(2<<30);
    }
}
