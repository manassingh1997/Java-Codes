package GroupRA.Unit_6;
import java.util.ArrayDeque;
public class StackAndQueue {
    public static void main(String[] args){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(8); // 8
        queue.offer(1); // 8, 1
        queue.offer(10); // 8, 1, 10
        System.out.println("queue: " + queue);
        System.out.println("first element: "+queue.peek());
        System.out.println("queue after peek: " + queue);
        System.out.println("remove first element: " + queue.poll());
        System.out.println("queue after poll: " + queue);
        System.out.println("Peek again: "+queue.peek());

    }
}
