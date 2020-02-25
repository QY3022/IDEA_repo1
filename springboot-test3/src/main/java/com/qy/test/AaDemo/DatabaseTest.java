package com.qy.test.AaDemo;

/**
 * @author by QY3022
 * @date 2020/2/11.
 */
public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest t = new DatabaseTest();
        //0
        String oracle = "jdbc:oracle:thin:@//219.135.182.2:8521/orcl";
        String oracle2 = "jdbc:oracle:thin:@//nhc.smart-info.cn:8521/orcl";

        //1
        String mysql = "jdbc:mysql://192.168.6.251:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String mysql2 = "jdbc:mysql://219.135.182.2:6306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String mysql3 = "jdbc:mysql://47.107.56.144:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String mysql4 = "jdbc:mysql://192.168.6.251:3306/dts?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String mysql5 = "jdbc:mysql://rm-wz9a1c8d803l35e2hio.mysql.rds.aliyuncs.com:3306/cloud?useUnicode=true&characterEncoding=utf-8&useSSL=false";

        //3
        String pgsql = "jdbc:postgresql://219.135.182.2:5432/postgres";
        String pgsql2 = "jdbc:postgresql://219.135.182.2:5432/dts";
        String pgsql3 = "jdbc:postgresql://219.135.182.2:5432/dts?searchpath=public";
        String pgsql4 = "jdbc:postgresql://192.168.6.101:5432/test_wzm";
        String pgsql5 = "jdbc:postgresql://192.168.6.101:5432/dg12345?currentSchema=c##12345";

        //4
        String hive2 = "jdbc:hive2://219.135.182.2:13601/default";
        String hive22 = "jdbc:hive2://219.135.182.2:13601/dts";

        //6
        String hauwei_hive2 = "jdbc:hive2://19.104.59.3:24002,19.104.59.2:24002,19.104.59.1:24002/hzy;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2;sasl.qop=auth-conf;auth=KERBEROS;principal=hive/hadoop.hadoop.com@HADOOP.COM;user.principal=dfgx";
        String hauwei_hive22 = "jdbc:hive2://219.135.182.2:13601/default";

        //7
        String gauss = "jdbc:zenith:@192.168.6.150:1888";


        System.out.println("---- 以下是Oracle ----");
        System.out.println("ip"+t.getIp(oracle));
        System.out.println("ip"+t.getIp(oracle2));

        System.out.println("---- 以下是mysql ----");
        System.out.println("ip"+t.getIp(mysql));
        System.out.println("ip"+t.getIp(mysql2));
        System.out.println("ip"+t.getIp(mysql3));
        System.out.println("ip"+t.getIp(mysql4));
        System.out.println("ip"+t.getIp(mysql5));

        System.out.println("---- 以下是pgsql ----");
        System.out.println("ip"+t.getIp(pgsql));
        System.out.println("ip"+t.getIp(pgsql2));
        System.out.println("ip"+t.getIp(pgsql3));
        System.out.println("ip"+t.getIp(pgsql4));
        System.out.println("ip"+t.getIp(pgsql5));

        System.out.println("---- 以下是hive2 ----");
        System.out.println("ip"+t.getIp(hive2));
        System.out.println("ip"+t.getIp(hive22));

        System.out.println("---- 以下是huawei_hive2 ----");
        System.out.println("ip"+t.getIp(hauwei_hive2));
        System.out.println("ip"+t.getIp(hauwei_hive22));

        System.out.println("---- 以下是gaussdb ----");
        String subStr = gauss.substring(gauss.indexOf("@") + 1, gauss.length());
        String ip = subStr.substring(0, subStr.indexOf(":")).replace(" ", "").trim();;
        String port = subStr.substring(subStr.indexOf(":") + 1, subStr.length()).replace(" ", "").trim();
        System.out.println(ip);
        System.out.println(port);

        System.out.println("999999999999999999".length());

    }

    public String getPort(String url) {
        String subStr = url.substring(url.indexOf("//") + 2, url.length());
        //ip
        String ip = subStr.substring(0, subStr.indexOf(":")).replace(" ", "").trim();;
        //port
        String port = subStr.substring(subStr.indexOf(":") + 1, subStr.indexOf("/")).replace(" ", "").trim();
        return port;
    }

    public String getIp(String url) {
        String subStr = url.substring(url.indexOf("//") + 2, url.length());
        //ip
        String ip = subStr.substring(0, subStr.indexOf(":")).replace(" ", "").trim();;
        //port
        String port = subStr.substring(subStr.indexOf(":") + 1, subStr.indexOf("/")).replace(" ", "").trim();
        return ip;
    }
}

