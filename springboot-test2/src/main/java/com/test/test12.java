package com.test;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.concurrent.Callable;

/**
 * @author QY3022
 */

class test12 implements Callable<Integer> {
    final int id;
    public test12(int id) { this.id = id; }
    @Override
    public Integer call() {
        Integer val = 0;
        for(int i = 0; i < 100; i++)
            val++;
        System.out.println(id + " " +
                Thread.currentThread().getName() + " " + val);
        return val;
    }
}
