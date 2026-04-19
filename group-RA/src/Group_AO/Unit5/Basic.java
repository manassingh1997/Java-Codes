package Group_AO.Unit5;

import java.io.IOException;
import java.util.*;
import java.io.*;
public class Basic {
    public static void main(String[] args){

        // Stream -> a flow of data
        // Input -> data comes into program
        // Output -> data goes out of program

        // Byte Stream          -> Image, videos    : Handles binary data
        // Abstract Class               : Concrete Class
        // InputStream                  : FileInputStream
        // OutputStream                 : FileOutputStream

        // Character Stream     -> Text file,       : Handles Text data
        // Abstract class               : Concrete Class
        // Reader                       : FileReader
        // Writer                       : FileWriter

//        Scanner sc = new Scanner(System.in); // take different datatype easily
//        System.out.println("Enter Number: ");// its slow
//        int x = sc.nextInt();
//        System.out.println("Number is: " + x);

        // BufferedReader : very fast / can only take String
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter in lines: ");
            while (true) {
                try {
                    System.out.println("Please Enter a Number: ");
                    String line = br.readLine();
                    int n = Integer.parseInt(line);
                    System.out.println(n);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
