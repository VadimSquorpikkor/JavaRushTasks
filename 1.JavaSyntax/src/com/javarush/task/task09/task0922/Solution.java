package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();//input = "08/18/2017"
        Date date = new Date(input);
        SimpleDateFormat datePattern = new SimpleDateFormat("MMM dd, yyyy");
        String output = datePattern.format(date);
        System.out.println(output);
        System.out.println(output.toUpperCase());//output = "ИЮН 08, 2018"

    }
}
