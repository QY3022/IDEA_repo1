package com.qy.utils;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/**
 * @author 丘健里
 * @date 2020/1/7
 * 注意：生成的密文长度根据明文的长度确定
 * 1、第一种加密：将jasypt中使用的盐写在程序中
 * 2、第二种加密：将加密的salt写在配置文件中jasypt.encryptor.password，使用的地方直接注入StringEncryptor
 */
public class JasyptUtil {

    /**
     * salt
     */
    private final static String salt = "OneSalt";

    /**
     * 加密
     *
     * @param value 待加密明文
     * @return
     */
    public static String encryptText(String value) {
        return cryptOr().encrypt(value);
    }

    /**
     * 解密
     *
     * @param value 待解密密文
     * @return
     */
    public static String decyptText(String value) {
        try {
            return cryptOr().decrypt(value);
        } catch (Exception e) {
            //解密时出现异常，返回原来的值
        }
        return value;
    }

    /**
     * @return
     */
    public static PooledPBEStringEncryptor cryptOr() {
        PooledPBEStringEncryptor encryptOr = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(salt);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName(null);
        config.setProviderClassName(null);
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        //IvGeneratorClassName这个属性不设置，默认值为org.jasypt.salt.NoOpIVGenerator
        //config.setIvGeneratorClassName("org.jasypt.salt.NoOpIVGenerator");
        config.setStringOutputType("base64");
        encryptOr.setConfig(config);
        return encryptOr;
    }

    /**
     * 例子
     *
     * @param args
     */
    public static void main(String[] args) {
        // 加密
        System.out.println(encryptText("145356uryt"));
        System.out.println(encryptText("145356uryt").length());
        // 解密
        System.out.println(decyptText("L47Rflj1s41sDqUsPNwh6Nf2O0isAfBe"));

//        System.out.println(decyptText("q/M+YmHGYTH8E+16UMJ6e0HuDxfqcDu5nTJUzzvhENimXRvhO19HCs8BC7kqCzbL6+Rq1AZ0Q1Y="));
        System.out.println("---- ---- ---- ----");
        System.out.println(encryptText(encryptText("123456")));
        System.out.println(decyptText(decyptText("PKoMeFFyKKzv3Kd/rkgDahF7Qm22TIXuUuSewqoUYoTqBYPRgoJUFg==")));
        System.out.println(decyptText("123456"));
    }
}