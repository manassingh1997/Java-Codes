package GroupMK_1.innerClass;

public class Outer {
    protected int number = 20;

    class Inner{
        int nums = 10;
        void show(){
            System.out.println("Number: "+number);
            System.out.println("Nums: "+nums);
        }
    }
//    void display(){
//        System.out.println("Number in OUter: "+nums);
//    }
}
