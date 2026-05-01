package GroupMK_2.Unit6;
import java.util.ArrayList;
import java.util.Collections;

public class DynamicArrays {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(5);
        arr.add(19);
        arr.add(1);
        for(int i = 0; i < 4; i++){
            arr.add(i);
        }
        int length = arr.size();
        System.out.println("Before deletion: " + arr);
        arr.add(2,888);
        arr.remove(5); // by index
        arr.remove(Integer.valueOf(1)); // remove by value
        arr.set(1,90);
        System.out.println("After deletion: " + arr);
        System.out.println(arr.get(3));
        Collections.sort(arr); // sorting ascending order
        System.out.println("Incresing order: "+arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Decresing Order: "+arr);

        if(arr.contains(5)) {
            System.out.println("5 exists");
        }
    }
}
