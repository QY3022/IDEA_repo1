package com.gyf.Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class test1 {
    private String s1 = "123";
    static BiConsumer<Integer, Double> bicid = (i, d) ->
            System.out.format("%d, %f%n", i, d);
    

    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        //流式编程
        m.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).forEach(System.out::println);
    }

}

