package GroupMK_1.Propagation;

import java.io.FileReader;

public class Multi {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("text.txt");
            try {
                int ch;
                while((ch = fr.read()) != -1){
                    System.out.println((char) ch);
                }
            } catch (Exception e) {
                System.out.println("Error in Inner: "+e.getMessage());
            }
            fr.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



        try {
            System.out.println("Creating a connection with database");
            try{
                int x = 10/0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Connection could not be established");
        }

        int[] arr = {1,2,3,4,5};

        try {
            int x = arr[1];
            x = x/0;
            System.out.println("X: " + x);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
    }
}
