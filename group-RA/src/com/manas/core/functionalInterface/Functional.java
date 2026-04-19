package com.manas.core.functionalInterface;

import java.util.Comparator;
import java.util.function.Predicate;


public class Functional {
    public static void main(String[] args){
        Comparator<Integer> comp = (x,y) -> x - y;
        int result = comp.compare(8,9);
        if (result > 0) System.out.println("Greater");
        else if (result < 0) System.out.println("Lesser");
        else System.out.println("Equal");

        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        if(isEven.test(7)) System.out.println("Is Even");
        else System.out.println("Not Even");

        Runnable r = () -> System.out.println("Running.....");
        r.run();
    }
}
