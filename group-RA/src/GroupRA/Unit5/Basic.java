package GroupRA.Unit5;

import java.util.*;
import java.io.*;

public class Basic {
    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        double m = sc.nextDouble();

        // Stream = a flow
        // Byte Stream -> Image, Video
        // abstract     : Concrete class
        // InputStream -> FileInputStream
        // OutputStream -> FileOutputStream
        // Character Stream -> File, text.txt,
        // abstract : concrete
        // Reader -> FileReader,
        // Writer -> FileWriter

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true){
                String line = br.readLine();
                System.out.println("Please enter a number");
                try {
                    int x = Integer.parseInt(line);
                    System.out.println("Number is " + x);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Exception: "+ e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Could not make the connection");
        }
    }
    // Scanner              BufferedReader
    // Easy                 a bit complex
    // Parsing built-in     manual parsing
    // slow                 fast
}
