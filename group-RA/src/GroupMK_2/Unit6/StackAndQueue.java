package GroupMK_2.Unit6;
import java.util.ArrayDeque;
public class StackAndQueue {
    public static void main(String[] args){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(8);
        q.offer(7);
        q.offer(1);
        q.offer(9);
        System.out.println(q);
        System.out.println("First: " + q.peek());
        q.poll();
        System.out.println("after remove"+ q);
    }
}
