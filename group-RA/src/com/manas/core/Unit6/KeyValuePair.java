package com.manas.core.Unit6;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePair {
    public static void main(String[] args){
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(1,2);
        mp.put(2,3);
        mp.put(5,6);
        for(var entry: mp.entrySet()){
            System.out.println("ID: " + entry.getKey() + " Value: " + entry.getValue());
        }
        mp.remove(2);
        System.out.println(mp);
    }
}
