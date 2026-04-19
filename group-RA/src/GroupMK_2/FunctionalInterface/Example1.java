package GroupMK_2.FunctionalInterface;

interface Operations{
    void operate();
}

@FunctionalInterface
interface Operations1 {
    void operate(int x);
}

public class Example1 {
    public static void main(String[] args){
        Operations e = new Operations() {
          public void operate() {
              System.out.println("Hello wolrd");
          }
        };
        Operations op = () -> System.out.println("Hello Lambda Expressions");
        op.operate();

        Operations1 sq = (x) -> System.out.println("Square: " + (x*x));
        sq.operate(7);
    }
}
