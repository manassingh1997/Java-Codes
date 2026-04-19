package com.manas.core.Exceptions;

import java.io.FileReader;
import java.io.IOException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        try{
            System.out.println("Connecting to DB");

            try {
                int x = 10/0;
                System.out.println(x);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a = -1;
        assert a <= 0: "Age cannot be negative";
        System.out.println(a);
//        try {
//            int x  = 10/3;
//            System.out.println(x);
//        } catch (ArithmeticException e){
//            System.out.println("Cannot Divide by zero");
//        } finally {
//            System.out.println("Code should I have runned");
//        }

//        FileReader reader =null;
//
//        try {
//            reader = new FileReader("file.txt");
//        } catch (Exception e){
//            System.out.println("File Does Not Exists");
//        }
//        finally {
//            if (reader != null){
//                reader.close();
//            }
//        }
//
//        checkAge(-19);

    }

//    private static void checkAge(int i) throws InvalidAgeException {
//
//        if (i<0){
//            throw new InvalidAgeException("Age cannot be less than zero");
//        }
//    }
}
