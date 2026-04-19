package GroupMK_1.Unit5;

import java.io.*;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("image.png")) {
            int data;
            while((data = fis.read()) != -1){
                System.out.println(data);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        fos.write(66); // A

        fos.close();
    }
}
