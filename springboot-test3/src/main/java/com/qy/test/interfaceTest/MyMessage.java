package com.qy.test.interfaceTest;


/**
 * @author by QY3022
 * @date 2020/1/17.
 */
@FunctionalInterface
public interface MyMessage<T extends Object> {
    public T  upper();
}
