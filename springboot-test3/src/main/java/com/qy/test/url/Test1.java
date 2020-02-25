package com.qy.test.url;

import org.springframework.util.StringUtils;

/**
 * @author by QY3022
 * @date 2020/2/25.
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        String url1 = "jdbc:oracle:thin:@nhc.smart-info.cn:8521:orcl";
        String url2 = "jdbc:oracle:thin:@//nhc.smart-info.cn:8521/orcl";
        System.out.println(t.addSlash(url2));

        String subStr = "nhc.smart-info.cn:8521:orcl";
        String str1 = subStr.substring(subStr.indexOf(":")+1,subStr.length());
        String str2 = str1.substring(0,str1.indexOf(":"));
        System.out.println(str1);
        System.out.println(str2);

    }

    public String addSlash(String url) {
        if (url.contains("//") || StringUtils.isEmpty(url)) {
            return url;
        }
        StringBuilder s = new StringBuilder(url);
        s.insert(url.indexOf("@") + 1, "//");
        return s.toString();
    }
}
