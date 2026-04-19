package GroupMK_1.FunctionalInterface;

import java.util.function.Predicate;
import java.util.Comparator;

//@FunctionalInterface
interface Operation {
    int operate(int x, int y);
}
public class Main {
    public static void main(String[] args){
//        Operation add = new Operation() {
//            public int operate(int x, int y){
//                return x + y;
//            }
//        };
        Operation add = (x, y) -> x + y;

        System.out.println(add.operate(8,7));
//        Operation subtract = new Operation() {
//            public int operate(int x, int y){
//                return x - y;
//            }
//        };
        Operation subtract = (x, y) -> x - y;
        System.out.println(subtract.operate(9,6));
        Runnable r = () -> System.out.println("Running...");
        r.run();

        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        if(isEven.test(8)) System.out.println("Even Number");
        else System.out.println("Odd Number");

        Comparator<Integer> comp = (x, y) -> x - y;
        int result = comp.compare(8,7);
        if(result < 0) System.out.println("Y is greater");
        else if (result > 0) System.out.println("X is greater");
        else System.out.println("X and Y are equal");
    }
}
