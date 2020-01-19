package com.test2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DtsMathUtil {

    /**
     * 取得double小数为两位,进1处理
     * 参考网址 https://www.cnblogs.com/dichuan/p/7769098.html
     * @param d
     * @return
     */
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

    public static double getRoundHalfUpDouble(double d,int len){
        try {
            if(d == 0)
                return 0.00;
            BigDecimal b = new BigDecimal(d);
            d = b.setScale(len, BigDecimal.ROUND_UP).doubleValue();
            return d;
        }catch (Exception e){
            System.out.println("getRoundHalfUpDouble,val d="+d);
            e.printStackTrace();
            return d;
        }
    }

    public static double add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
        return b1.add(b2).doubleValue();  
    }  

    // 进行减法运算
    public static double subtract(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));  
        BigDecimal b2 = new BigDecimal(Double.toString(v2));  
        return b1.subtract(b2).doubleValue();  
    }

    // 进行乘法运算
    public static double mul(double d1, double d2){
         BigDecimal b1 = new BigDecimal(d1);
         BigDecimal b2 = new BigDecimal(d2);
        return b1.multiply(b2).doubleValue();
     }

    // 进行除法运算
    public static double div(double d1,double d2,int len) {
         BigDecimal b1 = new BigDecimal(d1);
         BigDecimal b2 = new BigDecimal(d2);
        return b1.divide(b2,len,BigDecimal.ROUND_UP).doubleValue();
    }

    // 进行四舍五入操作
    public  static double round(double d,int len) {
         BigDecimal b1 = new BigDecimal(d);
         BigDecimal b2 = new BigDecimal(1);
        return b1.divide(b2, len,BigDecimal.ROUND_UP).doubleValue();
    }

    public static double getGBfromByte(long l){
       if(l == 0)
           return 0.0;
        Double a = Long.valueOf(l).doubleValue();
        Double b = Double.valueOf(1073741824.0);
        return div(a.doubleValue(),b.doubleValue(),2);
    }

    public static double getGBfromPgSize(String size){
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
                System.out.println("getGBfromPgSize没此类型.值:"+size);
                break;
        }
        return allSpcaseS;
    }

    public static void main(String[] args) {
        double d = -7d;
        double d2 = 11d;

        System.out.println(subtract(d, d2)/12d);
    }
}
