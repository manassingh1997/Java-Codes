package GroupMK_2.InnerClass;

public class Outer {
    private int number = 10;
    void display() {
        System.out.println("Outer class");
    }

    class Inner {
        int nums = 20;

        void show(){
            display();
            System.out.println("Number: " + number);
            System.out.println("Nums: " + nums);
        }
    }
}
