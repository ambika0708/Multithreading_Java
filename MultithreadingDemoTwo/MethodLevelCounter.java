package com.multithreading.MultithreadingDemoTwo;

public class MethodLevelCounter implements Runnable {

    @Override
    public void run() {
        int i = 0;
        for (;
             i < 10;
             ++i) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
