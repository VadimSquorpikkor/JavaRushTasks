package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date data = new Date(date);
        SimpleDateFormat dayCount = new SimpleDateFormat("D");
        return Integer.parseInt(dayCount.format(data)) % 2 != 0;
    }
}
