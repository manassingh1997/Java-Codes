package Group_AO.Unit5;

import java.io.*;

public class WriterPrint {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello");

        try (PrintWriter pr = new PrintWriter("text.txt")) {
            pr.println("Hello from Print Writer");
            pr.printf(" %d ",6);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
