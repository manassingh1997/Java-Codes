package Group_AO.Resources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("txt.txt")) {

            // code...

        } catch (IOException e){
            System.out.println("IO Exception..");
        }
    }
}
