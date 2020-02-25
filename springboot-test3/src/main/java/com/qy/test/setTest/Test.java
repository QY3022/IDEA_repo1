package com.qy.test.setTest;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author by QY3022
 * @date 2020/2/10.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.Demo();
    }

    public void Demo(){
        Set<String> set = Sets.newHashSet();
        set.add("1");
        set.add("2");
        set.add("1");
        System.out.println(set.size());
    }
}
