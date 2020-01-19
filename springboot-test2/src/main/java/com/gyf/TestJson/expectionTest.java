package com.gyf.TestJson;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class expectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(StringUtils.isEmpty(list));
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
