package GroupMK_2.FunctionalInterface;

import java.util.stream.Stream;
import java.util.*;

public class StreamAPI {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int x : arr){
            if(x%2==0){
                System.out.println("X: "+x);
            }
        }

        Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .map(x -> x*x)
                .forEach(System.out::println);

        long count = Arrays.stream(arr).filter(x -> x % 2 ==0).count();

        System.out.println("Count = " + count);

        int total = Arrays.stream(arr).filter(x -> x % 3 == 0).sum();

        System.out.println("Sum of array: " + total);
    }
}
