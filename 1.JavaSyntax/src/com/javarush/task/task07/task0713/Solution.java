package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mixedList = new ArrayList<>();
        ArrayList<Integer> x3List = new ArrayList<>();
        ArrayList<Integer> x2List = new ArrayList<>();
        ArrayList<Integer> xNList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mixedList.add(Integer.parseInt(reader.readLine()));
        }
        for (int i : mixedList) {
            if(i%3==0)x3List.add(i);
            if(i%2==0)x2List.add(i);
            if(i%3!=0&&i%2!=0)xNList.add(i);
        }
        printList(x3List);
        printList(x2List);
        printList(xNList);
    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i + " ");
        }
    }
}
