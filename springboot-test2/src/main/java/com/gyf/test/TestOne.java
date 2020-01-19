package com.gyf.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author QY3022
 *
 */
public class TestOne {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        list.add("g");
        for (String l : list) {
            System.out.println(l);
        }
    }
}
