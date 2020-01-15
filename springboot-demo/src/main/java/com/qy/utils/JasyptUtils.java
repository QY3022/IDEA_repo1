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
public class JasyptUtils {

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
            //解密出现异常，返回原来的值
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
     * 对DtsDatasource中的url、username、password进行解密
     *
     * @param d
     * @return
     */
/*    public static DtsDatasource decyptDtsDatasource(DtsDatasource d){
        try {
            String url = decyptText(d.getUrl());
            d.setUrl(url);
        } catch (Exception e) {
            //出现异常，说明数据库中存的数据是明文
        }

        try {
            String username = decyptText(d.getUsername());
            d.setUsername(username);
        } catch (Exception e) {
            //出现异常，说明数据库中存的数据是明文
        }

        try {
            String password = decyptText(d.getPassword());
            d.setPassword(password);
        } catch (Exception e) {
            //出现异常，说明数据库中存的数据是明文
        }
        return d;
    }*/

    /**
     * 解密url
     *
     * @param url
     * @return
     */
    public static String decyptUrl(String url){
        try {
            return decyptText(url);
        } catch (Exception e) {
            //出现异常，不做处理
        }
        return url;
    }

    /**
     * 解密username
     *
     * @param username
     * @return
     */
    public static String decyptUsername(String username){
        try {
            return decyptText(username);
        } catch (Exception e) {
            //出现异常，不做处理
        }
        return username;
    }

    /**
     * 解密password
     *
     * @param password
     * @return
     */
    public static String decyptPassword(String password){
        try {
            return decyptText(password);
        } catch (Exception e) {
            //出现异常，不做处理
        }
        return password;
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
        System.out.println(decyptText("L47"));
        System.out.println(encryptText("jdbc:mysql://219.135.182.2:6306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false"));
        System.out.println(decyptText("s6PL2H8T1zLsqL5EGPm03FREzL6gEdaaCk4GVAyuS7T3xTh6/ClApMXLN9Rl2cZzkTaqK9JOJ7E="));

        System.out.println("---- ---->>>>");
        String str = "i love you";
        System.out.println(decyptText(str));
        System.out.println(encryptText(decyptText(str)));
        System.out.println(decyptText("GJkyNIQjV5/Q6Nng0vw6EPgIqHqwPagG"));
    }
}