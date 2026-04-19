package com.manas.core.Unit5;
import java.lang.Runnable;

class MyRunnable implements Runnable {
    private String taskName;
    public MyRunnable(String name){
        this.taskName = name;
        System.out.println("Creating " + taskName);
    }

    @Override
    public void run(){
        System.out.println("Running " + taskName);
        try {
            for (int i = 0; i < 4; i++){
                System.out.println("Task: " + taskName + ", Iteration: "+ (i+1));
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Task " + taskName + " interrupted.");
        }
        System.out.println("Task " + taskName + " exiting");
    }
}
public class UsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("RunnableTask-1"));
        System.out.println("t1 State before start " + t1.getState());
        t1.start();
        System.out.println("t1 state after start " + t1.getState());
        Thread.sleep(500);
        System.out.println("t1 state during sleep " + t1.getState());
        Thread t2 = new Thread(new MyRunnable("RunnableTask-2"));
        t2.start();
        t1.join();
        System.out.println("After completion " + t1.getState());
    }
}
