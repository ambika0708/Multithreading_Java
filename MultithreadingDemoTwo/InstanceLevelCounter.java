package com.multithreading.MultithreadingDemoTwo;

public class InstanceLevelCounter implements Runnable {
    private int startValue;
    private int endValue;

    public InstanceLevelCounter(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }


    @Override
    public void run() {
        // synchronized (this) {
        for (;
             startValue < endValue;
             ++startValue) {

            System.out.println(Thread.currentThread().getName() + " " + startValue);
        }
        //startValue=0;
        // }
    }
}
