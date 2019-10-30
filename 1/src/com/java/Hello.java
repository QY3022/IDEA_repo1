package com.java;

import java.util.SortedMap;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello java");
        hello();
        extentsNum(2,3);
    }

    private static void hello(){
        System.out.println("I love you");
    }

    public void printlnMy(){
        System.out.println("我是那个很帅的男人");
        int i =0;
        i++;
        System.out.println(i);
    }

    public static void extentsNum(int a,int b){
        System.out.println(a+"::::"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+"::::"+b);
    }


}
