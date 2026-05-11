package com.manas.core.Unit5;

class Shared {
    public synchronized void waitMethod() {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try {
            wait(); // releases lock and waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed!");
    }
    public synchronized void notifyOne() {
        System.out.println("Notifying ONE thread...");
        notify(); // wakes one waiting thread
    }

    public synchronized void notifyAllThreads() {
        System.out.println("Notifying ALL threads...");
        notifyAll(); // wakes all waiting threads
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Shared obj = new Shared();
        Thread t1 = new Thread(() -> obj.waitMethod(), "Thread-1");
        Thread t2 = new Thread(() -> obj.waitMethod(), "Thread-2");
        Thread t3 = new Thread(() -> obj.waitMethod(), "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getState());
        Thread.sleep(1000); // ensure both threads start waiting

        Thread notifier = new Thread(() -> obj.notifyOne());
        notifier.start();
        System.out.println(t1.getState());
        Thread.sleep(1000);

        Thread notifierAll = new Thread(() -> obj.notifyAllThreads());
        notifierAll.start();
    }
}
