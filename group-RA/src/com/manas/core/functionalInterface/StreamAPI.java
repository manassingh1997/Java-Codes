package com.manas.core.functionalInterface;
import java.util.*;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args){
        // without stream api
        int[] arr = {1,2,3,4,5,6,7,8};

        for(int x: arr){
            if (x % 2 == 0){
                System.out.println((x*x)+"-");
            }
        }

        // With stream
        IntStream stream = Arrays.stream(arr);
        stream
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);

        long count = stream
                .filter(x ->x % 2 == 0)
                .count();
        System.out.println("Count: "+count);

        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: "+sum);

    }
}
