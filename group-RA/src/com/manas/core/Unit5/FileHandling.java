package com.manas.core.Unit5;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException{
//        //FileInputStream fis = new FileInputStream("image.png");
//
//        int data;
//
//        while ((data = fis.read()) != -1){
//            System.out.println(data);
//        }
//
//        //fis.close();
//
//        FileOutputStream fos = new FileOutputStream("copy.jpg");
//
//        fos.write(65);
//        fos.close();

//        FileWriter fw = new FileWriter("output2.txt", true);
//        fw.write("Hello World from file handling");
//        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        String line;

        while ((line = br.readLine()) != null ){
            System.out.println(line);
        }

        br.close();
    }
}
