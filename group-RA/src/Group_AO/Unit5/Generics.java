package Group_AO.Unit5;

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
    U getSec(){
        return second;
    }
}
public class Generics {
    public static void main(String[] args){
        Pair<Integer, String> p = new Pair<>(1,"Hello");
        System.out.println("First " + p.getFirst() + " Second: "+p.getSec());
        Box<Integer> myInt = new Box<>(8);
        System.out.println(myInt.getValue());


        //Box<String> myStr = new Box<>("Hello");
        //System.out.println(myStr.getValue());
    }
}
