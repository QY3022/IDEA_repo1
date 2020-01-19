package com.qy.test.thread;

import javax.swing.*;

/**
 * 三个线程卖10张火车票,10张票数据量太小看不出存在线程安全问题，把10变成100就能够看出来了
 * @author by QY3022
 * @date 2020/1/17.
 */
public class ThreadTestTicket {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();

        //这里是最直接的创建一个线程，run方法里面是这个线程需要做的事情，这个是使用匿名内部类来做的操作
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

}
