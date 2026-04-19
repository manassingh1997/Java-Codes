package Group_AO.LocalInner;

public class Outer {
    int number = 10;

    void display(){
        final int nums = 20;
        number += 100;
        //nums = 100;

        class InnerLocal{
            void show(){
                System.out.println("Inside Inner Local");
                System.out.println("Number: "+ number);
                System.out.println(("Nums: "+ nums));
            }
        }
        InnerLocal obj = new InnerLocal();
        obj.show();
    }
}
