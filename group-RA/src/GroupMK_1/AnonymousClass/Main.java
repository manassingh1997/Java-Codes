package GroupMK_1.AnonymousClass;
abstract class Example {
    abstract void show();
    void display() {
        System.out.println("Display Anonymous");
    }
}
public class Main {
    public static void main(String[] args){
        Example e = new Example() {
            void show() {
                System.out.println("Hello ANonymous");
            }
            void display() {
                System.out.println("Overriden Method display");
            }
        };
        e.show();
        e.display();
    }
}
