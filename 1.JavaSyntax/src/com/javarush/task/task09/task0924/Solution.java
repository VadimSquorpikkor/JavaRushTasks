package com.javarush.task.task09.task0924;

import java.util.ArrayList;

/* 
Страшная сказка

Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк. У каждого класса есть 2 поля: убил (killed ArrayList)
и съел (ate ArrayList). Создаем нужные объекты (hood, grandmother, ...), затем — расставляем святи правильно, кто кого съел
и убил, чтобы реализовать логику старой террианской сказки «Красная Шапочка».

*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        // напишите тут ваш код
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);


        woodman.killed.add(wolf);
    }

    //красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    public static class Grandmother extends StoryItem {
    }

    //пирожек
    public static class Patty extends StoryItem {
    }

    //дровосек
    public static class Woodman extends StoryItem {
    }

    //волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}
