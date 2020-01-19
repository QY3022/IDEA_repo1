package com.test2;

import com.google.common.collect.Lists;

import java.util.List;

public class test2 {

    public static void main(String[] args) {
        List<Integer> list = null;
        try {
            list.get(10);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("我是null指针异常");
        }

    }
}
