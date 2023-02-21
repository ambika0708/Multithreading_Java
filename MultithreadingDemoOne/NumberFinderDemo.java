package com.multithreading.MultithreadingDemoOne;

public class NumberFinderDemo {
    public static void main(String[] args) {
        int noToFind = 555;
        int[] nos = new int[1000];
        nos[205] = noToFind;
        LoudSpeaker speaker = new LoudSpeaker();
        NumberFinder workerOne = new NumberFinder("Worker-1", nos, 0, 99, noToFind,speaker);
        workerOne.start();
        NumberFinder workerTwo = new NumberFinder("Worker-2", nos, 100, 199, noToFind,speaker);
        workerTwo.start();
        NumberFinder workerThree = new NumberFinder("Worker-3", nos, 200, 299, noToFind,speaker);
        workerThree.start();
        NumberFinder workerFour = new NumberFinder("Worker-4", nos, 300, 399, noToFind,speaker);
        workerFour.start();
        NumberFinder workerFive = new NumberFinder("Worker-5", nos, 400, 499, noToFind,speaker);
        workerFive.start();


        /*for(int index=0; index<nos.length;++index){
            if(nos[index]==noToFind){
                System.out.println("No " + noToFind + " is found");
                break;
            }
        }*/
    }
}
