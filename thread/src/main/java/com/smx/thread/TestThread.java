package com.smx.thread;

/**
 * test thread
 */
public class TestThread implements Runnable {
    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i = " + i);
        }
    }
}
