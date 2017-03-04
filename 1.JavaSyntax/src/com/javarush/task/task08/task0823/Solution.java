package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res += s.substring(i, i + 1).toUpperCase();
            } else if (s.charAt(i) != ' ') {
                res += s.charAt(i);
            } else {
                res += " ";
            }
        }

        System.out.println(res);
    }
}
