package GroupMK_2.StaticClass;

public class Outer {
    static int number = 10;
    static void display() {
        System.out.println("hell oouter");
    }
    static class Inner {
        int nums = 10;

        void show(){
            display();
            System.out.println("Number: " + number);
            System.out.println("Nums: " + nums);
        }
    }
}
