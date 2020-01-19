package com.javase;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        Set<String> needSet = new HashSet<>(2);
        needSet.add("1");
        needSet.add("2");
        needSet.add("3");
        needSet.add("4");
        for(String s:needSet){
            System.out.println(s);
        }
    }
}
