package com.java;

import java.util.Objects;

public class Hello {
    public static void main(String[] args) {
        PrintStr("sss");

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

    public void pringtStr(){
        String s = "a,b,c,,";
        String[] strArray = s.split(",");
        System.out.println(strArray.length);
    }

    public static void PrintStr(String s){
        if(s.equals("sss")){
            System.out.println("I LOVE YOU");
        }
    }

}
