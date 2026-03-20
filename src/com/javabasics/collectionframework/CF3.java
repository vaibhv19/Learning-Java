package com.javabasics.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class CF3 {
    public static void main(String[] args) {
        //map used when storing key value pair
        //hashmap
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        System.out.println(map.get(2));

        //LinkedHashMap

        //HashMap doesn’t maintain any order of keys, while LinkedHashMap preserves insertion order.

        
    }
}
