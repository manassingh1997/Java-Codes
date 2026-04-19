package GroupMK_1.Propagation;

import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        checkAge(18);
        try{
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
        FileReader fr = new FileReader("text.txt");
    }
    static void checkAge(int age) throws Exception {
        if (age < 18){
            throw new IllegalArgumentException("Not Eligible to vote");
        }
        System.out.println("Eligible to Vote");
    }
} // create bank class with method withdraw
// throw error if balance not available

