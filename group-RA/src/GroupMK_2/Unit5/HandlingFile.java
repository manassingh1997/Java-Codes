package GroupMK_2.Unit5;
import java.io.*;
public class HandlingFile {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("text.txt",true);
        BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("\nFourth update to the file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fr = new FileReader("text.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
