package com.test;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum EnumArr {qo, nni, wo}

public class test11 {

    @Test
    public void TestQQ() {
        List<String> list = new ArrayList<>();
        int[] arr = {99, 9, 1, 2, 3, 4, 5};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(arr.toString());
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int[] arr = {99, 9, 1, 2, 3, 4, 5};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(arr.toString());
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);
    }

    @Test
    public void enumTest() {
        EnumArr[] e = EnumArr.values();
        String string = e.toString();
        
        System.out.println(string);
        System.out.println(EnumArr.nni);
    }

    @Override
    public String toString() {
        return "test11{}";
    }
}
