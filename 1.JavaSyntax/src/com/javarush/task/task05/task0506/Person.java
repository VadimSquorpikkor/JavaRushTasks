package com.javarush.task.task05.task0506;

/* 
Человечки
*/

public class Person {
    //напишите тут ваш код
    String name;
    int age;
    String address;
    char sex;

    public Person(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }


    public static void main(String[] args) {
        Person person = new Person("Vasya", 23, "Minsk", 'm');
    }
}
