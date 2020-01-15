package com.qy.test;

import com.qy.utils.JasyptUtils;

/**
 * @author QY3022
 * @date 2020/1/7
 */
public class Test4 {
    public static void main(String[] args) {
        String s = JasyptUtils.encryptText("123qwe");
        System.out.println(s);
        String url = JasyptUtils.decyptUrl("zbX3w9lr7GIOsVF69IY4xQ==");
        System.out.println(url);
    }
}
