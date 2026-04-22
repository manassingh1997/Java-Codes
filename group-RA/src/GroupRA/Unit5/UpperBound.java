package GroupRA.Unit5;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void printNumber(List<? super Integer> list){
        list.add(10);
       // list.add(1.1);
    }
    public static void main(String[] args){
        List<Integer> myInt = Arrays.asList(1,2,3,4,5);
        List<Double> myDoub = Arrays.asList(1.1,2.2,3.3,4.4);
        List<String> MyStr = Arrays.asList("a","b","c");
        printNumber(myInt);

    }
}
