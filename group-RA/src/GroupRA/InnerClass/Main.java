package GroupRA.InnerClass;

public class Main {
    public static void main(String[] args){
        Outer obj = new Outer();
        obj.display();


        Outer.Inner in1 = new Outer.Inner();
        in1.greeting();
        in1.show();
//        Car c1 = new Car();
//        Car.Engine e1 = c1.new Engine();
//        e1.show();
    }
}
// Car => horsepower,

