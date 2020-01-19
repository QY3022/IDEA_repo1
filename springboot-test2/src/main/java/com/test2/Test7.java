package com.test2;

/**
 * @author QY3022
 */
public class Test7 {
    public static void main(String[] args) {
        //10位随机数
        int a =  (int) ((Math.random()*9+1)*100000000);
       //5位随机数
        int b =  (int) ((Math.random()*9+1)*100000);;
        long aLong = Long.parseLong(Integer.toString(a) + Integer.toString(b));
        System.out.println(aLong);
        System.out.println(Long.toString(aLong).length());
    }
}
