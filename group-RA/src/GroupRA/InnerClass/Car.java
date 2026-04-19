package GroupRA.InnerClass;

public class Car {
    protected int horsepower = 800;
    void display(){
        System.out.println("Hello Outer class");
    }
    class Engine{

        void show(){
            display();
            System.out.println("Car Engine: "+horsepower);
        }
    }
}
