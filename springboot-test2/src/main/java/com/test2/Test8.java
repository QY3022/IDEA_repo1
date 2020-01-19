package com.test2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) {
        getSevenPrimaryKeyId();
        System.out.println(getSevenPrimaryKeyId());
        System.out.println(getSevenPrimaryKeyId().toString().length());
    }


    public static void test1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format("Thu Jan 02 14:05:21 CST 2020"));
    }

    public static void test2(){
        String url2 = "jdbc:oracle:thin:@//192.168.6.251:1521/orcl";
        url2 = url2.replace("192.168.6.251:1521","219.135.182.2:8521");
        System.out.println(url2.contains("192.168.6.251:1521"));
        System.out.println(url2.contains("219.135.182.2:8521"));
        System.out.println(url2);
    }

    public static Long getSevenPrimaryKeyId(){
        int a = (int) ((Math.random() * 9 + 1) * 1000000);
        return Long.parseLong(Integer.toString(a));
    }

}
