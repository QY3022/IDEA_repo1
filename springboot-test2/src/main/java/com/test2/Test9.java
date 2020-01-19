package com.test2;

import javax.annotation.concurrent.ThreadSafe;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @ThreadSafe 这个注解表示当前类是线程安全的类
 */

@ThreadSafe
public class Test9 {
    public static void main(String[] args) {
        System.out.println(getRoundHalfUpDouble(0.00));
        System.out.println(getRoundHalfUpDouble(0.01));

        //从这个地方开始测试
        Object obj = "11 GB";
        double gBfromPgSize = getGBfromPgSize((String) obj);
        double roundHalfUpDouble = getRoundHalfUpDouble(gBfromPgSize);
        System.out.println(roundHalfUpDouble);

        String str = String.format("i love yo'%s'","u");
        System.out.println(str);

        double d = 99999999999.0;




    }

    public static void test1() {
        double gBfromPgSize = getGBfromPgSize("11 GB");
        System.out.println(gBfromPgSize);
    }

    public static double getGBfromPgSize(String size) {
        String[] split = size.split(" ");
        double allSpcaseS = 0.0;
        switch (split[1]) {
            case "bytes":
                allSpcaseS = Double.parseDouble(split[0]) / 1024 / 1024 / 1024;
                allSpcaseS = DtsMathUtil.getRoundHalfUpDouble(allSpcaseS);
                break;
            case "kB":
                allSpcaseS = Double.parseDouble(split[0]) / 1024 / 1024;
                allSpcaseS = DtsMathUtil.getRoundHalfUpDouble(allSpcaseS);
                break;
            case "MB":
                allSpcaseS = Double.parseDouble(split[0]) / 1024;
                allSpcaseS = DtsMathUtil.getRoundHalfUpDouble(allSpcaseS);
                break;
            case "GB":
                allSpcaseS = Double.parseDouble(split[0]);
                allSpcaseS = DtsMathUtil.getRoundHalfUpDouble(allSpcaseS);
                break;
            default:
                System.out.println("getGBfromPgSize没此类型.值:" + size);
                break;
        }
        return allSpcaseS;
    }


    public static double getRoundHalfUpDouble(double d){
        DecimalFormat df = new DecimalFormat("#.00");
        try {
            if(d == 0)
                return Double.parseDouble(df.format(d));
            BigDecimal b = new BigDecimal(d);
            d = b.setScale(2, BigDecimal.ROUND_UP).doubleValue();
            return Double.parseDouble(df.format(d));
        }catch (Exception e){
            System.out.println("getRoundHalfUpDouble,val d="+d);
            e.printStackTrace();
            return Double.parseDouble(df.format(d));
        }
    }
}
