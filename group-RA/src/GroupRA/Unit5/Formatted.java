package GroupRA.Unit5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Formatted {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pr = new PrintWriter(System.out, true);

        pr.printf("Hello world %d", 8);
        pr.close();
        PrintWriter pw = new PrintWriter("output3.txt");
        pw.println("Hello World from class");
        pw.println(123);
        pw.printf("hello number %d", 555);
        pw.close();
    }
}
