package GroupMK_1.FunctionalInterface;

import java.util.Arrays;

public class Streamm {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,3,4,3,3};
        for(int x: arr){
            if(x % 2==0){
                System.out.println("x = "+x);
            }
        }
        Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .map(x -> x* x)
                .forEach(System.out::println);

        int total = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println("Total: "+total);

        long count = Arrays.stream(arr)
                .filter(x -> x == 3)
                .count();

        System.out.println("Count of 3: " + count);
    }
}
