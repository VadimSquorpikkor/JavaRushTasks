package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> res = new HashMap<>();
        res.put("qqq", "aaa");
        res.put("www", "aaa");
        res.put("eee", "sss");
        res.put("rrr", "sss");
        res.put("ttt", "ddd");
        res.put("ttt", "fff");
        res.put("yyy", "ggg");
        res.put("uuu", "hhh");
        res.put("iii", "jjj");
        res.put("ooo", "kkk");
        return res;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
