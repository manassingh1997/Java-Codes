package com.manas.core.Unit6;

import java.util.ArrayDeque;

public class DoubleEndedQueue {
    public static void main(String[] args){
        ArrayDeque<String> tasks = new ArrayDeque<>();
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");

        System.out.println("Processing: " + tasks.poll());
        System.out.println("Remainign Tasks: " + tasks);
    }
}
