package GroupRA.Unit5;
import java.io.*;
public class Main {
    public static void main(String[] args){
        try (FileReader fr = new FileReader("text.txt")){
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
