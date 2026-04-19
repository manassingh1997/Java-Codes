package com.manas.core.Unit5;
import java.util.*;
import java.io.*;
public class Basic {
    public static void main(String[] args) throws IOException{
        // Byte Stream Handles binary data
        // Character Stream Handles text data

        // Class heirarchy
        // Abstract Class -> Concrete Class
        // InputStream -> FileInputStream
        // OutputStream -> FileOutputStream

        // Using Scanner most common
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
        } else {
            System.out.println("Invalid Input! Please enter an integer");
        }
        sc.nextLine();
        String s = sc.nextLine();

        System.out.printf("%s -: text and %d -: number\n",s,99);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                String line = br.readLine();
                int dine = Integer.parseInt(line);
                System.out.printf("%d :- Line",dine);
                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a valid number");
            }
        }

        // Print Writer
        // is a class in java used to write formatted text output to console, file or other streams
        // PrintWriter is used to print data (text) in a convenient and formatted way.

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Hello World");
        pw.printf("Number: %d%n", 10);

        PrintWriter pw1 = new PrintWriter("text.txt");

        pw1.println("Hello File");
        pw1.println(123);
        pw1.printf("%d Number like hoe", 10);
        pw.close();
        pw1.close();
    }
}
