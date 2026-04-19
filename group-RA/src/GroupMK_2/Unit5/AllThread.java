package GroupMK_2.Unit5;
import java.lang.Thread;
class MyThread extends Thread{
    String t_name;
    MyThread(String name){
        this.t_name = name;
        System.out.println("Thread Created: " + t_name);
    }
    public void run(){
        System.out.println("Thread is Running: " + t_name);
        for(int i = 0; i< 4; i++){
            try {
                System.out.println("i = " + i + " for process " + t_name);
                Thread.sleep(2000);
            } catch (Exception e){
                System.out.println("Thread Interupted: " + t_name);
            }
        }
        System.out.println("Thread Executed: " + t_name);
    }
}
public class AllThread {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Thread-1");
        t1.start();
        MyThread t2 = new MyThread("Thread-2");
        t2.start();
    }
}
