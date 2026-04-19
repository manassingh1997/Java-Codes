package Group_AO.Unit5;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write("\nLine 2");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
