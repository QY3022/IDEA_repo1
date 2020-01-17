package com.qy.test;

import com.qy.utils.HandleColumnSystemIdsUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by QY3022
 * @date 2020/1/15.
 */
//@Component
//@ConfigurationProperties(prefix = "csc.asd")
public class Hello {


    public static void main(String[] args) {
        Hello hello = new Hello();
        pringtln();
    }

    public static void pringtln(){
        String id = "___111+1___,___111+6___,___111+6___,___111+6___,___111+6___";
        String s = HandleColumnSystemIdsUtil.removeColumnSystemIdsUnderLine(id);
        System.out.println(s);
    }



}
