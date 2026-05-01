package GroupMK_1.Unit6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
class Person implements Comparable<Person> {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
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

public class TreeSets00 {
    public static void main(String[] args){
        TreeSet<Person> set = new TreeSet<>(
                (a,b) -> b.name.compareTo(a.name) // sorting on basis of name
        );
        TreeSet<Person> set1 = new TreeSet<>(
                // incresing order (a,b) -> a.name.length() - b.name.length()
                (a,b) -> b.name.length() - a.name.length() // decreasing order
        );
        set1.add(new Person("AB", 8));
        set1.add(new Person("BCDd", 9));
        set1.add(new Person("CDE", 10));
        set1.add(new Person("AABCDE", 10));
        System.out.println(set1);
    }
}
