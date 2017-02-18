package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        int smallestSize = -1;
        int biggestSize = -1;
        int smallestPos = 0;
        int biggestPos = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            if(s.length()<smallestSize||smallestSize==-1){
                smallestSize = s.length();
                smallestPos = i;
            }
            if(s.length()>biggestSize){
                biggestSize = s.length();
                biggestPos = i;
            }
            list.add(s);
        }
        if(smallestPos<biggestPos) System.out.println(list.get(smallestPos));
        else System.out.println(list.get(biggestPos));
    }
}
