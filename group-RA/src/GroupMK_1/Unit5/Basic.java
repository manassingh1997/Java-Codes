package GroupMK_1.Unit5;

import java.util.*;
import java.io.*; // BufferedReader

public class Basic {
    public static void main(String[] args) throws IOException{
        // Streams -> a flow
        // Byte Stream -> image, video
        // abstract         : concrete class
        // InputStream      : FileInputStream
        // OutputStream     : FileOutputStream

        // Character Stream -> files,
        // abstract         : concrete class
        // Reader           : FileReader
        // Writer            : FileWriter

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        System.out.println(n);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                try {
                    System.out.println("Give 1st number: ");
                    line = br.readLine();
                    int x = Integer.parseInt(line);
                    System.out.println("Number is: " + x);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
