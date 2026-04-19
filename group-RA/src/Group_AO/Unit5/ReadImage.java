package Group_AO.Unit5;

import java.io.FileInputStream;
import java.io.*;

public class ReadImage {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("image.png");
        int data;
        while((data = fis.read()) != -1){
            System.out.println(data);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("copy.jpg");
        fos.write(66); // B
        fos.close();
    }
}
