package GroupMK_1.Unit5;

import java.util.ArrayList;

class Box<T extends Number> {
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
class Pair<T,U> {
    private T first;
    private U second;
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
}
public class Generics {
    public static void main(String[] args){
        Pair<Integer, String> p = new Pair<>(1,"Hello");
        System.out.println("First: " + p.getFirst() + " Second: " + p.getSecond());
        Box<Integer> myBox = new Box<>(6);
        System.out.println(myBox.getValue());
        //Box<String> myString = new Box<>("Hello");
        //System.out.println(myString.getValue());
    }
}
