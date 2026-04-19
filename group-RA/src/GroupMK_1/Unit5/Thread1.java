package GroupMK_1.Unit5;

class MyThread extends Thread {
    private String threadName;
    MyThread(String name){
        this.threadName = name;
        System.out.println("Creting Thread: " + threadName);
    }
    public void run() {
        System.out.println("Running Thread: " + threadName);
        for(int i = 0; i < 6; i++){
            try {
                System.out.println("Iteration Thread " + threadName + ", i: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interupted " + threadName);
            }
        }
        System.out.println("Thread Execution Completed: " + threadName);
    }
}

public class Thread1 {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Thread-1");
        t1.start();
        MyThread t2 = new MyThread("Thread-2");
        t2.start();
    }
}
