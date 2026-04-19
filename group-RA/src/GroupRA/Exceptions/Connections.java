package GroupRA.Exceptions;

import java.io.IOException;
import java.io.FileReader;
public class Connections {
    public static void main(String[] args){
        try (FileReader fr = new FileReader("text.txt")) {
            // code
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e){
                System.out.println("error");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
