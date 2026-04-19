package GroupMK_2.ExceptionHandling;

public class Main {
    public static void main(String[] args){
        method1();
        System.out.println("Hello There");
    }
    static void method1(){
        System.out.println("I am in method 1");
        method2();
    }
    static void method2(){
        try {
            method3();
            System.out.println("This is method 2");
        } catch (Exception e){
            System.out.println("Caught in method 2");
        }
    }
    static void method3(){
            try {
                int x = 10/0;
            } catch (Exception e) {
                System.out.println("MEthod 3");
            }
    }
}
