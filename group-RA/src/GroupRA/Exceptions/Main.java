package GroupRA.Exceptions;

public class Main {
    public static void main(String[] args){
        method1();
        System.out.println("Hello there");
    }
    static void method1() {
        System.out.println("Method 1");
        method2();
    }
    static void method2(){
        try {
            method3();
        } catch (Exception e){
            System.out.println("Method 2 handled it");
        }
    }
    static void method3() {
            try {
                int x = 10 / 0;
            } catch (Exception e){
                System.out.println("Method 3");
            }
    }
}
