package GroupMK_2.Unit5;

import java.util.Scanner;
import java.io.*; // BufferedReader, InputStreamReader
public class Basics {
    public static void main(String[] args) {
        // Stream : a flow of data
        // Input: data that flows into the program
        // Output: data that goes out of program
        // Byte Stream -> Handles Binary Data: images, videos etc
        // Abstract class               : concrete class
        // InputStream                  : FileInputStream
        // OutputStream                 : FileOutputStream

        // Character Stream: Handles text data, files
        // Abstract class               : Concrete Class
        // Reader                       : FileReader
        // Writer                       : FileWriter

//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int x = sc.nextInt();
//            System.out.println(x);
//        } else {
//            System.out.println("Invalid input");
//        }

        // Buffered Reader : reads Line by Line

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    System.out.println("Enter some data");
                    String line = br.readLine();
                    int x = Integer.parseInt(line);
                    System.out.println("Data: " + line);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for Integers");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
