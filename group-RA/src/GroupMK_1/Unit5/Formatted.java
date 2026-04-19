package GroupMK_1.Unit5;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Formatted {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("text.txt", true));

        pw.println("Hello print writer");
        pw.printf(" %d: " , 100);
        //pw.print("WIll this go to new line");
        pw.println("\n" + "This will be a new line");
        pw.append("Supposed to be a new line");
        pw.close();
    }
}
