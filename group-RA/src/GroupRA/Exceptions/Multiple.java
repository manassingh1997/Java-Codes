package GroupRA.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Multiple {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,3,4};
        try {
            int x = arr[1];
            int y = 10/0;
            FileReader fr = new FileReader("text.txt");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
