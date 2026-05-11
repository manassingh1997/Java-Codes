package com.manas.core.Unit5;

class Box<T> {
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
class Pair<T, U>{
    private T first;
    private U second;
    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    T getFirst() {
        return first;
    }
    U getSecond() {
        return second;
    }
}

public class Generic_Class {
    public static void main(String[] args){
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(43);
        System.out.println("String: " + stringBox.getValue());
        System.out.println("Integer: " + intBox.getValue());
        Pair<Integer, String> new_pair = new Pair<>(5, "Hello");
        System.out.println("First: " + new_pair.getFirst() + " Second: " + new_pair.getSecond());
    }
}
