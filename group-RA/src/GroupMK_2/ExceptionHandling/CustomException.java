package GroupMK_2.ExceptionHandling;
class AgeLessThan18Exception extends Exception {
    AgeLessThan18Exception(){
        System.out.println("Age Cannot be less than 18");
    }
    AgeLessThan18Exception(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws AgeLessThan18Exception{
            checkAge(17);
    }
    static void checkAge(int age) throws AgeLessThan18Exception{
        if (age < 18){
            throw new AgeLessThan18Exception("message passed");
        }
        System.out.println("Valid Age");
    }
}
