package GroupMK_1.LocalInner;

public class Outer {
    int number = 10;

    void print(){
        System.out.println("Inside Outer Class");
    }
    void display(){
        final int nums = 20;

        class InnerLocal{
            void show(){
                print();
                System.out.println("Inside Inner Local");
                System.out.println("Number: "+number);
                System.out.println("Nums: "+ nums);
            }
        }
        InnerLocal obj = new InnerLocal();
        obj.show();
    }
}
