package GroupRA.Exceptions;


import java.io.FileReader;
import java.io.IOException;

public class ThrowSomething {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text.txt");

        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Age cannot be less than 18");
        }
    }
    static void checkAge(int age) throws IllegalArgumentException{
        if (age < 18){
            throw new IllegalArgumentException("Invalid Age");
        }
        System.out.println("Valid");
    }
}
