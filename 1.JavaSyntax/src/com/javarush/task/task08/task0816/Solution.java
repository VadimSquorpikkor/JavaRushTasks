package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Seee", new Date("OCTOBER 1 1980"));
        map.put("Stalffff", new Date("JUNE 1 1980"));
        map.put("Tkgkgkg", new Date("JUNE 1 1980"));
        map.put("Sdsdsd", new Date("JUNE 1 1980"));
        map.put("Stalldsdsdsd", new Date("JUNE 1 1980"));
        map.put("Sta", new Date("JUNE 1 1980"));
        map.put("Stane", new Date("JUNE 1 1980"));
        map.put("Se", new Date("JUNE 1 1980"));
        map.put("Sone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry<String, Date> entry = iter.next();
            /*if (entry.getValue().toString().contains("Jun") ||
                entry.getValue().toString().contains("Jul") ||
                entry.getValue().toString().contains("Aug")) {
                iter.remove();
            }*/
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*HashMap<String, Date> mapp = createMap();
        removeAllSummerPeople(mapp);
        for (HashMap.Entry<String, Date> entry : mapp.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
    }
}
