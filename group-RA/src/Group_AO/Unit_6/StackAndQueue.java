package Group_AO.Unit_6;
import java.util.ArrayDeque;
public class StackAndQueue{
    public static void main(String[] args){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(6);
        q.offer(9);
        q.offer(8);
        System.out.println(q);
        System.out.println("First item: " + q.peek());
        q.poll();
        System.out.println("After removal: " + q);
        System.out.println("First item: " + q.peek());
    }
}
