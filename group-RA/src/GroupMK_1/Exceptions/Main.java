package GroupMK_1.Exceptions;

public class Main {
    public static void main(String[] args){
        try {
            int num = 10/0;
            System.out.println(num);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Execution Done");
        }
    }
}
