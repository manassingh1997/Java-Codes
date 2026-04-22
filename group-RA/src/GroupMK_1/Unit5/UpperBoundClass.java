package GroupMK_1.Unit5;

import java.util.*;

public class UpperBoundClass {
    public static void printNumber(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(1,2,3);
        List<Double> doubleList = Arrays.asList(1.1,2.2,3.3);
        printNumber(intList);
        printNumber(doubleList);
        //List<String> stringList = Arrays.asList("a","b","c");
        //printNumber(stringList);
    }
}
