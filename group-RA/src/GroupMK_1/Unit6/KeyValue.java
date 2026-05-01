package GroupMK_1.Unit6;
import java.util.HashMap;
public class KeyValue {
    public static void main(String[] args){
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('a',1);
        mp.put('b',2);
        mp.put('c',3); // this will be overridden
        mp.put('c',4);
        mp.put('d',4); // O(1)
        if(mp.containsKey('a')){ // O(1)
            System.out.println("Yes key available");
        }
        System.out.println(mp.get('c')); // O(1)

        for(var entry: mp.entrySet()){
            System.out.println("Key: "+ entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("Keys: ");
        mp.remove('c');
        mp.clear(); // deletes the entire data structure
        for(char key: mp.keySet()){ // O(n)
            System.out.print(" "+key);
        }
    }
}
