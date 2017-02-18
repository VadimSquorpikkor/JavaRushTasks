package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("Vasya", true, 57);
        Human ded2 = new Human("Petya", true, 59);
        Human bab1 = new Human("Olya", false, 50);
        Human bab2 = new Human("Vika", false, 52);
        Human father = new Human("Sasha", true, 33, ded1, bab1);
        Human mother = new Human("Dasha", false, 31, ded2, bab2);
        Human kid1 = new Human("Masha", false, 7, father, mother);
        Human kid2 = new Human("Misha", true, 8, father, mother);
        Human kid3 = new Human("Lyosha", true, 8, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















