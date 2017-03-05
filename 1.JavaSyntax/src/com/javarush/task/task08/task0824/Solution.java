package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human kid1 = new Human("Kid1", 6, true);
        Human kid2 = new Human("Kid2", 4, false);
        Human kid3 = new Human("Kid3", 2, true);
        ArrayList<Human> kids = new ArrayList<>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        Human dad = new Human("Dad", 36, true, kids);
        Human mom = new Human("Mom", 32, false, kids);
        Human grandPa = new Human("GrandPa", 66, true, dad);
        Human grandMa = new Human("GrandMa", 62, false, dad);
        Human grandPa2 = new Human("GrandPa2", 66, true, mom);
        Human grandMa2 = new Human("GrandMa2", 62, false, mom);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

        System.out.println(dad);
        System.out.println(mom);

        System.out.println(grandMa);
        System.out.println(grandPa);
        System.out.println(grandMa2);
        System.out.println(grandPa2);
    }

    public static class Human {
        //напишите тут ваш код

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public Human(String name, int age, boolean sex, Human child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child);
        }

        String name;
        int age;
        boolean sex;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
