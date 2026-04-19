package Group_AO.ThrowSomething;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("tet.txt");;
        try {
            fr = new FileReader("text.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (NullPointerException e) {
            System.out.println("File Does not Exists");
        } finally {
            fr.close();
        }


//        int x  = 10;
//        if ( x < 18) {
//            throw new IllegalArgumentException("X less than 18");
//        }
//        checkAge(17);
    }
//    static void checkAge(int a) throws Exception{
//        if ( a < 18){
//            throw new ArithmeticException("Not Eligible to Vote");
//        }
//        System.out.println("Eligible to vote");
//    }
}
