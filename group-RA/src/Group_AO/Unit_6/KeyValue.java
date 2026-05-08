package Group_AO.Unit_6;
import java.util.HashMap;
public class KeyValue {
    public static void main(String[] args){
        HashMap<Character, Integer> ascii = new HashMap<>();
        ascii.put('a',97);
        ascii.put('b',98);
        ascii.put('c',100);
        ascii.put('c',99);
        ascii.remove('c');
        if(ascii.containsKey('c')) {
            int a = ascii.get('c');
            System.out.println("value of c: "+a);
        } else {
            System.out.println("No c exists");
        }
        if(ascii.containsValue(99)){
            System.out.println("Value exists");
        }
        System.out.println(ascii);
        ascii.clear();
        System.out.println(ascii);
        int[] arr = {1,2,3,1,1,1,2,3,5,5,6};
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int x: arr){
            if(count.containsKey(x)){
                int y = count.get(x);
                y++;
                count.put(x,y);
            } else {
                count.put(x,1);
            }
        }
        System.out.println(count);
    }
}
