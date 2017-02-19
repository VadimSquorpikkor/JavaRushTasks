package com.javarush.task.task08.task0812;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            //list.add(scanner.nextInt());
            list.add(Integer.parseInt(reader.readLine()));
        }
        //Collections.sort(list);

        int maxValue = 1;
        int tempValue = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                tempValue++;
                if (tempValue > maxValue) maxValue = tempValue;
            }
            else tempValue = 1;
        }
        System.out.println(maxValue);

    }
}