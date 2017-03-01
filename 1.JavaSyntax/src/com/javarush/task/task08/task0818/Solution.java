package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();//напишите тут ваш код
        map.put("fam1", 800);
        map.put("fam2", 200);
        map.put("fam3", 400);
        map.put("fam4", 600);
        map.put("fam5", 100);
        map.put("fam6", 300);
        map.put("fam7", 8600);
        map.put("fam8", 900);
        map.put("fam9", 200);
        map.put("fam10", 800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код


        Iterator<HashMap.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() < 500) {
                iter.remove();
            }
        }
    }

    /*public static void removeItemFromMap(HashMap<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue() < 500); //То же самое, но короче
    }*/

    public static void main(String[] args) {
        //removeItemFromMap(createMap());
        /*HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }*/
    }
}