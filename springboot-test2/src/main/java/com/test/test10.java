package com.test;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author QY3022
 */
public class test10 extends test9{

    @Test
    public void testTest(){
        test9.print();
        test9 t = new test10();
        t.printA();
        printB();
    }

    @Override
    public void printB() {
        System.out.println("我是抽象类，我是继承后实现的方法");
        List<String> list = Lists.newArrayList();
        String remove = list.remove(0);
    }
}
