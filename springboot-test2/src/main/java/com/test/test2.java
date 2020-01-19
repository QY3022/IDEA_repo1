package com.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author QY3022
 */
public class test2 {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime l = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println(l.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
