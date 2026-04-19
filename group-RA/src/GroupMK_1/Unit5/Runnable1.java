package GroupMK_1.Unit5;
import java.lang.Runnable;
class MyRunnable implements Runnable{
    private String t_name;
    public MyRunnable(String name){
        this.t_name = name;
        System.out.println("Thread Created: " + t_name);
    }
    @Override
    public void run(){
        System.out.println("Running " + t_name);
        try {
            for (int i = 0; i < 4; i++){
                System.out.println("Task: " + t_name + ", Iteration: "+ (i+1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Task " + t_name + " interrupted.");
        }
        System.out.println("Task " + t_name + " exiting");
    }
}

public class Runnable1 {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable("Thread-1"));
        t1.start();
        Thread t2 = new Thread(new MyRunnable("Thread-2"));
        t2.start();
    }
}
