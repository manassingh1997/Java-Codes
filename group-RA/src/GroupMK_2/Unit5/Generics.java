package GroupMK_2.Unit5;

class Box<T>{
    T value;
    Box(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}
class Pair<T extends Number, U extends Number>{
    T first;
    U second;
    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    T getFirst(){
        return first;
    }
    U getSecond(){
        return second;
    }
}
public class Generics {
    public static void main(String[] args){
        Pair<Integer, Double> myPair = new Pair<>(1,9.0);
        System.out.println("First: " + myPair.getFirst() + " Second: " + myPair.getSecond());
        Box<Integer> myInt = new Box<>(6);
        Box<String> myString = new Box<>("Hello");
        System.out.println(myInt.getValue());
    }
}
