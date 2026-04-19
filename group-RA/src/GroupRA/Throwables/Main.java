package GroupRA.Throwables;

public class Main {
    public static void main(String[] args) throws Exception {
//        int age = 17;
//
//        if (age < 18) {
//            throw new ArithmeticException("Not Eligible");
//        }
//        System.out.println("Eligible");
        try{
            checkAge(17);
        } catch (Exception e){
            System.out.println("Handling error");
        }
    }

    static void checkAge(int age) throws Exception {
        if(age < 18) {
            throw new ArithmeticException("Underage");
        }
        System.out.println("Valid age");
    }
}
