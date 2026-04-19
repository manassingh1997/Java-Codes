package GroupMK_2.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyword {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("txt.txt")) {
            // task

            int ch;
            while((ch = fr.read()) != -1){
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }





//        try {
//
//            try {
//                // coding blocks
//            } catch (Exception e) {
//                System.out.println("Error");
//            }
//            fr.close();
//        } catch (IOException e){
//            System.out.println("Connection could not be established");
//        }

//        checkAge(17);
//        int balance = 1000;
//        try {
//            withdraw(1090, balance);
//        } catch (Exception e) {
//            System.out.println("Exception Handled");
//        }

    }
    static void withdraw(int amount, int balance) throws Exception {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Not enough Balance");
        }
        balance -= amount;
        System.out.println("Balance: " + balance);
    }
    static void checkAge(int age) throws Exception{
        if (age < 18){
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
        System.out.println("Valid age for voting");
    }
}
