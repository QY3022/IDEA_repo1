package com.test;

public class test3 {
    public static void main(String[] args) {
        Double rows =0.00;
        rows = (double) 1231238000/10000;
        System.out.println(rows);
        int a = (int) ((rows * 1000)) % 10;
        System.out.println(a);
        String format = String.format("%.2f", rows);
        System.out.println(format);
    }
}
