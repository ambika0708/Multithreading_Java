package com.multithreading.MultithreadingDemoOne;

public class NumberFinder extends Thread {
    private int[] nos;
    private int startIndex;
    private int endIndex;
    private int noToSearch;
    private LoudSpeaker speaker;

    public NumberFinder(String name, int[] nos, int startIndex,
                        int endIndex, int noToSearch, LoudSpeaker speaker) {
        super(name);
        this.nos = nos;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.noToSearch = noToSearch;
        this.speaker = speaker;
    }

    @Override
    public void run() {
        System.out.println("I am " + Thread.currentThread().getName() + " searching within index " + this.startIndex + " to " + this.endIndex);
        for (; startIndex < endIndex; ++startIndex) {
            if (speaker.isFound()) {
                System.out.println(Thread.currentThread().getName() + " Stop searching, number is found");
                break;
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am " + Thread.currentThread().getName() + " at index " + startIndex);
            if (nos[startIndex] == noToSearch) {
                speaker.setFound(true);
                System.out.println("No " + noToSearch + " is found at index " + startIndex + " by " + this.getName());
            }
        }

    }


}
