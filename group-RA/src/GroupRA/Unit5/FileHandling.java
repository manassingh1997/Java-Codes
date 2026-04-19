package GroupRA.Unit5;

import java.io.*;

public class FileHandling {
    public FileHandling() throws IOException {
    }

    public static void main(String[] args) throws IOException{
        try (FileReader fr = new FileReader("text.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
        bw.write("Hello from the class");
    }



}
