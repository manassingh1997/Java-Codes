package Group_AO.FunctionalInterface;
import java.util.function.Predicate; // test
import java.util.Comparator; // compare

interface Hello {
    void speak();

}
public class Example {
    public static void main(String[] args){
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Running...");
            }
        };
        Runnable r1 = () -> System.out.println("Running thred 1....");
        r1.run();
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        if (isEven.test(9)) System.out.println("Even");
        else System.out.println("Odd");

        Comparator<Integer> comp = (x, y) -> x - y;
        int result = comp.compare(9,9);
        if (result > 0) System.out.println("x greater");
        else if (result < 0) System.out.println("y greater");
        else System.out.println("Both equal");
    }
}
