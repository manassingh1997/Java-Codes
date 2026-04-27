package GroupMK_1.Unit6;
import java.util.*;
public class Sets {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        if (set.contains(2)) {
            System.out.println("Yes Available");
        }
        set.remove(2);
        boolean flag = set.isEmpty();
        for(int x: set){
            System.out.print(" X: " + x);
        }
    }
}
