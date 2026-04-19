package com.manas.core.Unit5;

class SharedCounter {
    private int count = 0;
    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName() + " count is : " + count);
    }
    public int getCount(){
        return count;
    }
}

class CounterThread implements Runnable {
    private SharedCounter counter;
    public CounterThread(SharedCounter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            counter.increment();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        Thread t1 = new Thread(new CounterThread(counter), "Thread-1");
        Thread t2 = new Thread(new CounterThread(counter), "Thread-2");
        Thread t3 = new Thread(new CounterThread(counter), "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final COunt: " + counter.getCount());
    }
}
