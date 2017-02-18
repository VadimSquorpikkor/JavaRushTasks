package com.javarush.task.task05.task0506;

/* 
Человечки
Создать class Person. У человека должно быть имя String name,
возраст int age, адрес String address, пол char sex.
*/

public class Person {
    //напишите тут ваш код
    String name;
    int age;
    String address;
    char sex;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Vasya";
        person.age = 23;
        person.address = "Minsk";
        person.sex = 'm';
    }
}
