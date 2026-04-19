package GroupRA.FunctionalInterface;
import java.util.Arrays;

@FunctionalInterface
interface Example {
    int operate(int x, int y);
}

public class Main {
    public static void main(String[] args){
//        Example add = (x,y) -> x + y;
//        System.out.println("Addition: " + add.operate(4,5));
//        Example subs = (x, y) -> x-y;
//        System.out.println("Subs: "+ subs.operate(7,4));
//        Example mul = (x,y) -> x*y;
//        System.out.println("Mult: " + mul.operate(5,6));
//        Example div = (x,y) -> x/y;
//        System.out.println("Div: " + div.operate(8,2));

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int x: arr){
            if(x%2==0){
                System.out.println("X: "+x);
            }
        }

        Arrays.stream(arr)
                .filter(x -> x%2==0)
                .map(x -> x * x)
                .forEach(System.out::println);

        int total = Arrays.stream(arr)
                .filter(x->x%2==0)
                .sum();

        System.out.println(total);
        long count = Arrays.stream(arr)
                        .filter(x -> x% 2==0)
                                .count();
        System.out.println(count);
    }
}
