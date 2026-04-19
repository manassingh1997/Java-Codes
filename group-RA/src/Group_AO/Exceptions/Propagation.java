package Group_AO.Exceptions;

public class Propagation {
    public static void main(String[] args){
        method1();
        System.out.println("Hello There");
    }
    private static void method1() {
        method2();
    }
    private static void method2() {
                method3();
    }
    private static void method3() {
        try {
            int a = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Exception at method 3");
        }
    }
}
