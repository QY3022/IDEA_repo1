package com.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test8 {

    private String str="";
    private static Logger logger = LoggerFactory.getLogger(test8.class);

    public static void main(String[] args) {
        Path test = Paths.get("test");
        System.out.println(test);
    }

    @Test
    public void fileTest(){
        String str = "asd + asd";
        String[] split = str.split(" ",2);
        for(String s:split){
            System.out.println(s);
        }

    }

}
