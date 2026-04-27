package GroupMK_2.Unit5;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public static void printNumber(List<? extends Number> list){
        for(Number x : list){
            System.out.print(x + " ");
        }
    }
    public static void addElements(List<? super Integer> list){
        list.add(5);
        list.add(5);
    }
    public static void main(String[] args){
        List<Integer> intList = List.of(1,2,3,4);
        printNumber(intList);
    }
}
