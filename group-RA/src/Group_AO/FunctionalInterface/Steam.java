package Group_AO.FunctionalInterface;

import java.util.Arrays;

public class Steam {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int x: arr){
            if(x % 2 == 0){
                System.out.println("x: " + x);
            }
        }
        Arrays.stream(arr)
                .filter(x -> x%2==0)
                .map(x -> x * x)
                .forEach(System.out::println);

        int total = Arrays.stream(arr).sum();
        System.out.println("Total = "+total);

        long count = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println("Even Total number: " + count);
    }
}
