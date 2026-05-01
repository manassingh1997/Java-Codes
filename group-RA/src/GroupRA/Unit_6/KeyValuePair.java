package GroupRA.Unit_6;
import java.util.HashMap;
public class KeyValuePair {
    public static void main(String[] args){
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('a', 97);
        mp.put('b', 98);
        mp.put('c', 99);
        mp.put('c', 100);
        mp.remove('c');
        if(mp.containsKey('a')) System.out.println("Yes");
        for(var entry: mp.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        for(char key: mp.keySet()){
            System.out.println("Key: " + key);
        }
        for(int val: mp.values()){
            System.out.println("Val: " + val);
        }
    }
}
