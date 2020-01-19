package com.qy.test;

import com.qy.test.interfaceTest.MyMessage;

/**
 * @author by QY3022
 * @date 2020/1/17.
 */
public class EnumTest {
    public static void main(String[] args) {
        MyMessage<String> msg =  "hello"::toUpperCase;
        System.out.println(msg.upper());
    }
}
