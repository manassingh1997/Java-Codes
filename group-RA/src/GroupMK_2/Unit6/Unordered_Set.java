package GroupMK_2.Unit6;
import java.util.HashSet;
public class Unordered_Set {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(5);
        set.add(7);
        set.add(5);
        set.remove(5);
        int length = set.size();

        // set.clear(); Removes the entire set
        System.out.println(set);
        if(set.contains(7)){
            System.out.println("7 exits");
        }
    }
}
