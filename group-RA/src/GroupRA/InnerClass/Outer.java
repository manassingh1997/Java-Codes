package GroupRA.InnerClass;

public class Outer {
    static int number = 10;

    static void display(){
        System.out.println("Outer method");
    }

    static class Inner{
        void greeting(){
            System.out.println("Hello Inner Class");
        }
        void show(){
            display();
            System.out.println("Number: "+ number);
        }
    }
}
