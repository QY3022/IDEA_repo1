package com.test;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author QY3022
 */

public class test6 {

    private static Logger logger = LoggerFactory.getLogger(test6.class);
    public static void main(String[] args) {
        String s = printMyHandSomeBoy();
        System.out.println(s);

    }

    public static String printMyHandSomeBoy(){
        return "you are handsome boy";
    }

    @Test
    public void afterEachMy(){
        System.out.println(" i love you !");
    }

    public void guavaTest(){
        //创建集合list
        List<Integer> list = Lists.newArrayList();
        assert false;
        assert true;

    }

}
