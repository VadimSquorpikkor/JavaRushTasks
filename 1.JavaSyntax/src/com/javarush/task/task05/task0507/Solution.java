package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int a = scanner.nextInt();
            if(a==-1)break;
            sum+=a;
            count++;
        }
        System.out.println((double)sum/(double)count);
    }
}

