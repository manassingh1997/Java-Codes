package com.manas.core.Unit5;

class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("count = "+count);
    }
    void final_count(){
        System.out.println("Final value of Count: "+count);
    }
}

class MyRunnable1 implements Runnable {
    private Counter counter;
    public MyRunnable1(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            counter.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Synchronization2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyRunnable1(counter));
        Thread t2 = new Thread(new MyRunnable1(counter));
        Thread t3 = new Thread(new MyRunnable1(counter));

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        counter.final_count();
    }
}
