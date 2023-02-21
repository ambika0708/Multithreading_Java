package com.multithreading.MultithreadingDemoTwo;

public class SampleThread extends Thread{
    public SampleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Begin: " + Thread.currentThread().getName());
        for(int i=0;i<10;++i){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("End: " + Thread.currentThread().getName());
    }
}
