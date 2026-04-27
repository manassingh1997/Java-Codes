package GroupRA.Unit_6;
import java.util.HashSet;
public class Sets {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>(); // create unordered sets

        set.add(5);
        set.add(8);
        set.remove(8);
        if (set.contains(8)){
            System.out.println("Exists");
        } else System.out.println("Does not exists");
        for(int x: set){
            System.out.println("x: " + x);
        }
    }
}
