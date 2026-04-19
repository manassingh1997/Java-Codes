package GroupMK_2.LocalInner;

public class Outer {
    int number = 10;
    void display() {
        int nums = 20;
        number += 100; // number = number + 100;
        class Inner {
            void show(){
                System.out.println("Inside inner local");
                System.out.println("Number: " + number);
                System.out.println("Nums: " + nums);
            }
        }
        Inner obj = new Inner();
        obj.show();
    }
}
