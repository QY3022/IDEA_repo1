package com.test;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class test5 {
    private static Logger logger = Logger.getLogger(test5.class.getName());
    public static void main(String[] args) {
        double a = 2.12345;
        double ceil = Math.ceil(a*100)/100;
        System.out.println(ceil);
        logger.info("sss");
    }

    /**
     * 进一法保留小数点后两位 0.120003
     * @param count
     * @return
     */
    private double getDoubleTowPoint(double count){
        //获取小数点后面的位数
        double number = 0.00;
        int i =3;
        int a = (count + "").length() - (count + "").indexOf(".") - 1;
        if(a<=2){
            return count;
        }
        if(a>2){
            //取得小数点第i位上的数字,i的初始值是3
            int g = ((int) (count * 10*i)) % 10;
            if(g>=5){
                number = Double.parseDouble(String.format("%.2f",count));
            }
            if(0<g && g<5){
                number = Double.parseDouble(String.format("%.2f",count));
                number+=1/(10*(i-1));
            }
            if(g==0){
                i++;
                getDoubleTowPoint(count);
            }
        }
        return number;
    }
}
