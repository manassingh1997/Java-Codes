package GroupMK_1.Unit6;

import java.util.ArrayDeque;

public class StackAndQueue {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(8);
        dq.offer(3);
        dq.offer(10); // O(1)
        System.out.println(dq);
        dq.poll(); // O(1)
        System.out.println(dq);
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("hello");
        stack.push("world");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
