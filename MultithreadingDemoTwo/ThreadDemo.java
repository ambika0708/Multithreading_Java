package com.multithreading.MultithreadingDemoTwo;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        //InstanceLevelCounter counter = new InstanceLevelCounter(0,10);
        Runnable counter = new InstanceLevelCounter(0, 10);
        //Runnable counter = new MethodLevelCounter();

        Thread thread1 = new Thread(counter, "Thread-1");
        thread1.setPriority(1);
        thread1.start();
        Thread thread2 = new Thread(counter, "Thread-2");
        thread2.start();
        Thread thread3 = new Thread(counter, "Thread-3");
        thread3.setPriority(7);
        thread3.start();
    }

    public static void main1(String[] args) throws InterruptedException {
        System.out.println("Begin: " + Thread.currentThread().getName());

        SampleThread thread = new SampleThread("MyThread");
        thread.start();
        Thread.sleep(1000);
        System.out.println("End: " + Thread.currentThread().getName());
    }

}
