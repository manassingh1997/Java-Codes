package Group_AO.Unit_6;

import java.util.HashSet;
import java.util.Set;

public class Unordered_Set {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('d');
        set.add('a');
        set.add('b');
        set.add('a');
        set.remove('a');
        if(set.contains('a')) System.out.println("YES");
        else System.out.println("NO");
        System.out.println(set);
        System.out.println("Length of set: " + set.size()); // for arraylist as well
    }
}
