package Group_AO.Static_Class;

public class Outer {
    static int number = 10;

    void show(){
        int num  = 9;
        class InnerLocal{
            void print(){

                System.out.println("Inner Local Class");
                System.out.println("Number: "+number);
                System.out.println("No: "+ num);
            }
        }
        InnerLocal ob1 = new InnerLocal();
        ob1.print();
    }
    static class Inner{
        int no = 1;
        void display(){
            System.out.println("Static Inner Class\nNumber: "+ number);
            System.out.println("No: "+ no);
        }
    }
}
