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
        String res = s.substring(0, 1).toUpperCase();
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' '&&s.charAt(i+1)!=' ') { //второе условие на случай с несколькими пробелами
                res += " ".concat(s.substring(i + 1, i + 2).toUpperCase());
                i++;
            }
            else res += s.charAt(i);
        }

        System.out.println(res);
    }
}
