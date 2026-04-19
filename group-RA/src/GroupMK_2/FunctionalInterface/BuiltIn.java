package GroupMK_2.FunctionalInterface;

import java.util.Comparator;
import java.util.function.Predicate;

public class BuiltIn {
    public static void main(String[] args){
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        if (isEven.test(8)) System.out.println("Even number");
        else System.out.println("Odd Number");

        Runnable r = () -> System.out.println("Running...");
        r.run();

        Comparator<Integer> comp = (x, y) -> x-y;
        int result = comp.compare(4,5);
        if (result > 0) System.out.println("Greater");
        else if (result < 0) System.out.println("Lesser");
        else System.out.println("Equal");
    }
}
