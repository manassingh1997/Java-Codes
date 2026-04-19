package GroupMK_2.ExceptionHandling;

public class Multiple {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        try {
            int x = arr[9];
            int y = 10/0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
