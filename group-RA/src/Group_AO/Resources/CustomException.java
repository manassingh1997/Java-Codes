package Group_AO.Resources;

class AgeLessThan18Exception extends Exception {
    AgeLessThan18Exception() {
        System.out.println("Age Cannot be Less than 18");
    }
    AgeLessThan18Exception(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws AgeLessThan18Exception{
        checkAge(17);
    }
    static void checkAge(int age) throws AgeLessThan18Exception {
        if (age < 18) {
            throw new AgeLessThan18Exception("Message passed");
        }
        System.out.println("Valid Age");
    }
}
