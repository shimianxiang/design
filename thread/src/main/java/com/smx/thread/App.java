package com.smx.thread;

public class App {

    public static void main(String[] args) {
        TestThread mt1 = new TestThread("线程A");
        TestThread mt2 = new TestThread("线程B");
        TestThread mt3 = new TestThread("线程C");
        // mt1.run();
        // mt2.run();
        // mt3.run();

        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        Thread t3 = new Thread(mt3);
        t1.start();
        t2.start();
        t3.start();


    }
}
