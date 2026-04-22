package Group_AO.Unit5;
class Calc<T extends Number, U extends Number>{
    T a;
    T b;
    Calc(T a, T b){
        this.a = a ;
        this.b = b;
    }
    public double add(){
        return a.doubleValue() + b.doubleValue();
    }
}
public class Calculator {
    public static void main(String[] args){
        Calc<Integer, Double> no1 = new Calc<>(6,8);
        System.out.println(no1.add());
    }
}
