package GroupRA.Exceptions;

class AgeLessThan18Exception extends Exception {
    AgeLessThan18Exception() {
        System.out.println("Why is the age less than 18");
    }
    AgeLessThan18Exception(String message){
        super(message);
    }
}
public class Custom {
    public static void main(String[] args) throws AgeLessThan18Exception{
        int age = -5;

        assert age > 0 : "Age cannot be negatice";
        // java -ea Custom.java
        // checkAge(17);
    }

    //    static void checkAge(int age) throws AgeLessThan18Exception{
//        if (age < 18) {
//            throw new AgeLessThan18Exception("Age Cannot be less than 18");
//        }
//        System.out.println("Valid age");
//    }
}
