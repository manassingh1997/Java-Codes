package GroupMK_1.TryResources;

import java.io.FileReader;

class AgeLessThan18Exception extends Exception {
    AgeLessThan18Exception() {
        System.out.println("Age Cannot be less than 18");
    }
    AgeLessThan18Exception(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws AgeLessThan18Exception {
//        try (FileReader fr = new FileReader("text.txt")) {
//            int ch;
//            while((ch = fr.read()) != -1){
//                System.out.println((char) ch);
//            }
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        checkAge(2);
    }
    static void checkAge(int x) throws AgeLessThan18Exception {
        if (x < 18) {
            throw new AgeLessThan18Exception("Why is age less than 18");
        }
        System.out.println("Eligible");
    }
}
