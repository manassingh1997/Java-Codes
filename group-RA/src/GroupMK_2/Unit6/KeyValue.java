package GroupMK_2.Unit6;
import java.util.HashMap;
public class KeyValue {
    public static void main(String[] args){
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('a',96); // O(1)
        mp.put('b',97);
        mp.put('c',99);
        System.out.println(mp);
        int val = mp.get('b');
        System.out.println("b: " + val);
        mp.remove('c');
        mp.clear();
        System.out.println("After removing c: "+mp);
        if(mp.containsKey('a')){
            System.out.println("a: "+mp.get('a'));
        }
        if(mp.containsValue(97)){
            System.out.println("Yes 97 is there");
        }

        int[] arr = {1,1,1,2,1,4,3,2,3,4,5,3,5,4,6,4};
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int x: arr){
            if(count.containsKey(x)){
                int value = count.get(x);
                value++;
                count.put(x,value);
            } else {
                count.put(x,1);
            }
        }
        System.out.println(count);
    }
}
