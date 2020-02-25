package com.qy.test.listTest;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/13.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.Demo2();
    }

    public void Demo1(){
        List<Integer> list = Lists.newArrayList();
        List<Integer> list2 = Lists.newArrayList();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        System.out.println(list);
        for (Integer a : list) {
            if (a == 1) {
                continue;
            }
            list2.add(a);
        }
        System.out.println(list2);
    }

    public void Demo2(){
        String str = "770406560400149";
        String abc = "999999999999999";
        System.out.println(str.length());
        System.out.println(abc.length());
    }



}
