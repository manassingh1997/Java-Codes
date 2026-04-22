package Group_AO.Unit5;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void printNumber(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }
    public static void addNumber(List<? super Integer> list){
        list.add(8);
        //list.add(9.9);
        list.add(0);
    }
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(1,2,3);
        List<Double> doubleList = Arrays.asList(1.1,2.2,3.3);
        printNumber(intList);
        printNumber(doubleList);
//        List<String> stringList = Arrays.asList("a","b","c");
//        printNumber(stringList);
    }
}

