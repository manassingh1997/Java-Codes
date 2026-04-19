package com.manas.core.Unit5;
import java.lang.Thread;
class MyThread extends Thread{
    private String threadName;

    MyThread(String name){
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
            System.out.println("Thread " + threadName + " exiting.");
        }
    }
}
public class Thread1 {
    public static void main(String[] args){
        MyThread t1 = new MyThread("JavaThread-1");

        t1.start();

        MyThread t2 = new MyThread("JavaThread-2");
        t2.start();
    }
}
