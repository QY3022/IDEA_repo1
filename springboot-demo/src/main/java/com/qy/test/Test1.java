package com.qy.test;

import com.qy.App;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author QY3022
 * @date 2020/01/06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class Test1 {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void contextLoads() {
        //加密方法
        String encrypt = stringEncryptor.encrypt("123eadsfsgdzx456");
        System.out.println(encrypt);
        System.out.println(encrypt.length());
        //解密方法
        System.out.println(stringEncryptor.decrypt("6g4occGtYIvbVx4qYzPXQg=="));
        System.out.println(stringEncryptor.decrypt("ouXoOaxYQOfgi+CUPlmG4A=="));
    }

}
