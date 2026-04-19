package GroupMK_1.staticClass;

public class Outer {
    static int nums = 10;

    static class Inner{
        int number = 20;

        void show(){
            System.out.println("Number: " + number);
            System.out.println("Nums: " + nums);
        }
    }
}
