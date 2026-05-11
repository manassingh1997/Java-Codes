package com.manas.core.Unit6;

import java.util.*;

class Person implements Comparable<Person> {
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return name;
    }
}

public class TreeSettss {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(3);
        set.add(8);
        System.out.println(set);

        TreeSet<Person> set1 = new TreeSet<>(
                (a,b) -> b.name.length() - a.name.length()
        );
        set1.add(new Person("Manas Singh"));
        set1.add(new Person("Ashok"));
        set1.add(new Person("Aman Goswami"));
        set1.add(new Person("Parthiv"));
        set1.add(new Person("Gopala"));
        System.out.println(set1);

    }
}
