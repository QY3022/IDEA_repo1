package com.qy.test.arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author by QY3022
 * @date 2020/2/4.
 */
public class SaftList {
    /**
     * 证明list是线程不安全的 ,java 跟 大数据 ，文史不分家
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(int i =0;i<30;i++){
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().toUpperCase().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }

        List<String> list2 = Collections.synchronizedList(new ArrayList<>());
        List<String> list3 = new CopyOnWriteArrayList<>();

    }
}
