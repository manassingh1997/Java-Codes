package GroupRA.Unit_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Generic_collection {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(5);
        for(int i = 0; i<5; i++){
            arr.add(i);
        }
        arr.add(5); // adding 6th element
        arr.add(2,44); // insert at particular index
        arr.set(1,55); // setting an element
        arr.remove(2);
        arr.remove(Integer.valueOf(2));
        if (arr.contains(5)){
            System.out.println("5 is there in array");
        }
        Collections.sort(arr,Collections.reverseOrder());

        for(int i = 0; i < arr.size(); i ++){
            System.out.print(arr.get(i) + " ");
        }

        Integer[] arr1 = arr.toArray(new Integer[0]);
    }
}
