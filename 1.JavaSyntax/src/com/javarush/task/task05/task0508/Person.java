package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    //напишите тут ваш код
    private String name;
    private int age;
    private String address;
    private char sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Vasya");
        person.setAge(23);
        person.setAddress("Minsk");
        person.setSex('m');

    }
}
