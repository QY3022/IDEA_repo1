package com.qy.test;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/**
 * @author QY3022
 */
public class Test2 {
    public static void main(String[] args) {
        String password = "123456";
        String data = "root123we342546576789gfhjda";

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName(null);
        config.setProviderClassName(null);
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        //IvGeneratorClassName这个属性不设置，默认值为org.jasypt.salt.NoOpIVGenerator,默认生成24位密文
//        config.setIvGeneratorClassName("org.jasypt.salt.NoOpIVGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);

        //加密
        String encrypt = encryptor.encrypt(data);
        System.out.println(encrypt);
        System.out.println(encrypt.length());

        //拿到密文进行解密
        String decrypt = encryptor.decrypt("mUJlIhK1V8d1dE7H9EFeVg==");
        System.out.println(decrypt);
    }
}
