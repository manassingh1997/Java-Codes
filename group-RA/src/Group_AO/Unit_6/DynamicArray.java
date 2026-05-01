package Group_AO.Unit_6;

import java.util.ArrayList;
import java.util.Collections;
public class DynamicArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(2);
        arr.add(9);
        arr.add(1);
        arr.add(6);
        System.out.println("Before Removing: " + arr);
        // arr.reove(1) remove by index
        // arr.remove(Integer.valueOf(1)); // remove by value
        arr.set(1,999);
        // Collections.sort(arr); ascending order
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("After Removing: " + arr);
        if(arr.contains(91)) System.out.println("Yes");
        else System.out.println("NO");
    }
}
