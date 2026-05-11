package com.manas.core.Examples;

import java.util.Comparator;
import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args){
        Comparator<Integer> comp = (a, b) -> a-b;

        int result = comp.compare(90,8);

        if(result > 0) {
            System.out.println("Is greater");
        } else {
            System.out.println("Is not greater");
        }

        Predicate<Integer> isEven = (x) -> x%2==0;

        if(isEven.test(8)){
            System.out.println("Is Even");
        } else {
            System.out.println("Not Even");
        }

    }
}
