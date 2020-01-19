package com.gyf.liu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.stream.IntStream.*;
public class test1 {
    public static void repeat(int n ,Runnable action){
        range(0,n).forEach(i -> action.run());
    }
    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(5, () -> System.out.println("----!"));
        Logger logger = LoggerFactory.getLogger(test1.class);
    }
}
