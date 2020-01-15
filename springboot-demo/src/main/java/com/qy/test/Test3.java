package com.qy.test;

import com.qy.utils.JasyptUtils;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author QY3022
 *
 */

public class Test3 {
    public static void main(String[] args) {
        //加密，字符串
        String str1 = "i love you";
        String str2 = "please speak ";
        String str3 = "me to ll iou";
       //加密第一个字符串
//        String str1P = JasyptUtils.encryptPwd("OneSalt", str1);
//        String str2P = JasyptUtils.encryptPwd("OneSalt", str2);
//        String str3P = JasyptUtils.encryptPwd("OneSalt", str3);
        System.out.println("下面是加密后的密文");
//        System.out.println(str1P+"chang du ::"+str1P.length());
//        System.out.println(str2P+"chang du ::"+str2P.length());
//        System.out.println(str3P+"chang du ::"+str3P.length());



    }
}
