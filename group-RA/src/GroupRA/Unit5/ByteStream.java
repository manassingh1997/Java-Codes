package GroupRA.Unit5;

import java.io.FileInputStream;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("image.png");
        int data;

        while ((data = fis.read()) != -1) {
            System.out.println(data);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("copy1.jpg");
        fos.write(66); // B
        fos.close();
    }
}
