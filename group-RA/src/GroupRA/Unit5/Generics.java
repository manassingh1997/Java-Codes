package GroupRA.Unit5;
class Box<T extends Number>{
    T value;
    Box(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
class Pair<T, U>{
    T first;
    U second;
    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    T getFirst(){
        return first;
    }
}
public class Generics {
    public static void main(String[] args){
        Pair<Integer, String> myPair = new Pair<>(1,"Hello");
        Box<Integer> myInt = new Box<>(8);
        System.out.println(myInt.getValue());
        //Box<String> myString = new Box<>("h");
        //System.out.println(myString.getValue());
    }
}
