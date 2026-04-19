package GroupRA.LocalInner;

public class Outer {
    int number = 10;
    void print(){
        number += 10;
        int hello = 5;
        hello += 1;
        System.out.println("Outer class "+hello);
    }
    void display() {
        final int nums = 20;

        class Inner {
            void show(){
                System.out.println("local inner class");
                System.out.println("Number: " + number);
                System.out.println("Nums: " + nums);
            }
        }
        Inner obj = new Inner();
        obj.show();
    }
}
