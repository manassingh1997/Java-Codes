package GroupRA.Unit5;

import java.lang.Thread;

class MyThread extends Thread {
    private String threadName;
    public MyThread(String name){
        this.threadName = name;
        System.out.println("Thread Created: " + threadName);
    }

    public void run(){
        System.out.println("Thread is Running: " + threadName);
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Value of i " + (i) + ", for thread " + threadName);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Program Interrupted " + threadName);
            }
        }
        System.out.println("Thread Execution Completed: " + threadName);
    }
}class MyThread1 extends Thread {
    private String threadName;
    public MyThread1(String name){
        this.threadName = name;
        System.out.println("Thread Created: " + threadName);
    }

    public void run(){
        System.out.println("Thread is Running: " + threadName);
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Value of i " + (i) + ", for thread " + threadName);
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println("Program Interrupted " + threadName);
            }
        }
        System.out.println("Thread Execution Completed: " + threadName);
    }
}

public class CreteThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("Thread-1");
        t1.start();
        MyThread1 t2 = new MyThread1("Thread-2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Execution Completed for all");
    }
}
