package com.qy.test.thread;

/**
 * @author by QY3022
 * @date 2020/1/17.
 */
public class MyThread implements Runnable {
    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println("卖票 -- ticket" + this.ticket--);
            }
        }
    }
}
