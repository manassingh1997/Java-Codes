package GroupMK_1.Propagation;


public class Main {
    public static void main(String[] args){
        method1();
        System.out.println("Hello there");
    }
    static void method1(){
        try {
            method2();
        } catch (ArithmeticException e){
            System.out.println("Error mehtod 1 caught");
        }
    }
    static void method2(){
            int a = 10/0;
    }
}
