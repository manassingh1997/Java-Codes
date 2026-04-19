package GroupRA.Exceptions;

import java.util.Scanner;
//Throwable
public class Example1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = -7;
        assert age >= 0 : "Age Cannot be Zero or less than zero";
        // java -ea Exceptions/Main
        //int age = sc.nextInt();
        //System.out.println(age);
        // try, catch and finally
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);
        try {
            int num = 10/2;
            // open the connection process it
        } catch (Exception e) {
            System.out.println("Cannot divide by zero..");
        } finally {
            System.out.println("Execution done");
        }

//        int num = 10/0;
//        System.out.println(num);
    }
}
