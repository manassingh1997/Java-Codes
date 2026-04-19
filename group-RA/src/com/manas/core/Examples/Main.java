package com.manas.core.Examples;

import java.util.*;
@FunctionalInterface
interface Add {
    Float addNum(int x, int y);
}

@FunctionalInterface
interface Runnable {
    void run();
}
public class Main {
    public static void main(String[] args){
        Example e = new Example(){
            public void show() {
                System.out.println("Hello World");
            }
        };
        e.show();

        Example e1 = () -> System.out.println("Hello Lambda Expression");
        e1.show();

        Add a = Float::sum;
        System.out.println(a.addNum(7,8));

        Runnable r = () -> System.out.println("Running....");
        r.run();

        Thread t = new Thread(() -> System.out.println("Thread Running..."));
        t.start();

        List<Integer> arr = Arrays.asList(5,22,4,6,7,10);
        // ascending
        Collections.sort(arr,(x,y) -> x - y);
        System.out.println(arr);
        // Decending
        Collections.sort(arr, (x,y) -> y-x);
        System.out.println(arr);
    }
}
