package GroupMK_1.Unit5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class FileHandling {
    public static void main(String[] args){
        try (FileWriter fr = new FileWriter("text.txt", true)) {
            fr.write("\nI am a person\n");
            fr.write("This should be the second line");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader fr = new FileReader("text.txt")){
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
