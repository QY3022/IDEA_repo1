package com.qy.test;

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
        ResourceBundle rb = ResourceBundle.getBundle("Messages");
    }
}
