package com.qy.test.listPage;

/**
 * @author by QY3022
 * @date 2020/2/24.
 */
public class Test {
    public static void main(String[] args) {
        Page page = new Page();
        Page fen = ServicePage.fen(page);
        System.out.println(fen);
    }
}
