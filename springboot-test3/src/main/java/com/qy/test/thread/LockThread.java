package com.qy.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by QY3022
 * @date 2020/2/4.
 */
public class LockThread {
    private int number = 30;
    /**
     * Lock 是接口，右边是实现类
     */
    Lock lock = new ReentrantLock();

    public void sale(){
        lock.lock();
        try{
            if(number > 0 ){
                System.out.println(Thread.currentThread().getName()+"卖票,卖出第"+ (number--) +"张，剩下"+number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
