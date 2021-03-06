package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        //printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

     public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> res = new HashSet<>();
        res.add(new Dog());
        res.add(new Dog());
        res.add(new Dog());
        return res;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> res = new HashSet<>();
        res.addAll(cats);
        res.addAll(dogs);
        return res;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat {

    }

    public static class Dog {

        @Override
        public String toString() {
            return "I'm the Dog! Waf!";
        }
    }
    //напишите тут ваш код
}
