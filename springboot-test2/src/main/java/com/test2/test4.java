package com.test2;

public class test4 {
    public static void main(String[] args) {
        String id = "_123_";
        System.out.println(removeColumnSystemIdsUnderLine(id));
    }

    public static String removeColumnSystemIdsUnderLine(String id) {
        if (id == null || "".equalsIgnoreCase(id)) {
            return "";
        }
        return id.replace("_", "");
    }

}
