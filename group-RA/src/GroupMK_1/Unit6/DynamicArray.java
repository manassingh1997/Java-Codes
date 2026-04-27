package GroupMK_1.Unit6;
import java.util.*;

public class DynamicArray {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(5);
        for(int i = 0; i < 5; i++){
            list.add(i);
        }
        list.add(75);
        System.out.println("After Adding: ");
        for(int i = 0; i < list.size(); i ++){
            System.out.print(" " + list.get(i));
        }
        list.remove(5);
        list.remove(Integer.valueOf(3));
        list.set(0,45);
        Collections.sort(list);
        if(list.contains(40)){
            System.out.println("\nYes its there");
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nAfter Removing");
        for(int i = 0; i < list.size(); i ++){
            System.out.print(" " + list.get(i));
        }
        if (list.isEmpty()){
            System.out.println("\n list empty");
        } else {
            System.out.println("\n not empty");
        }
    }
}
