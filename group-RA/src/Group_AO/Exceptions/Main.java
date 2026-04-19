package Group_AO.Exceptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try{
            int x = 10/0;
        } catch (Exception e){
            System.out.println("Cannot divide by zero");
        }
//        int age = -1;
//
//        assert age > 0 : "Age cannot be negative";

        //int a = "c";
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        try {
//            System.out.println("Addition: " + (a + b));
//            System.out.println("Substraction: " + (a-b));
//            System.out.println("Multiplication: " + (a * b));
//            System.out.println("Division: " + (a/b));
//        } catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        } finally {
//            System.out.println("Code Executed!...");
//        }
    }
}
