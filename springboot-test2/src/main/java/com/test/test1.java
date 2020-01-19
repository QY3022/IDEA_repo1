package com.test;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class test1 {
    public static void main(String[] args) {
        double d = 1.2358;
        String format = String.format("%.3f", d);
        String[] split = format.split(".");
        System.out.println(split[0]);
        System.out.println(d%d);
    }
}
