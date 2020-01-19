package com.test;


import java.text.DecimalFormat;

public class test13 {

    public static void main(String[] args) {
        double d = 114.0;
        DecimalFormat df = new DecimalFormat("######0.00");
        System.out.println(Double.parseDouble(df.format(d)));
    }

}
