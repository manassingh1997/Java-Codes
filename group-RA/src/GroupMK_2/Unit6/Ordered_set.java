package GroupMK_2.Unit6;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    int age;
    String name;
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}

public class Ordered_set {
    public static void main(String[] args){
        TreeSet<Person> p_set = new TreeSet<>(
                (a, b) -> b.compareTo(a)
        );
        p_set.add(new Person(23, "Hello"));
        p_set.add(new Person(34,"World"));
        p_set.add(new Person(13, "ABCD"));
        System.out.println(p_set);
        TreeSet<String> set = new TreeSet<>(
                (a,b) -> b.length() - a.length()
        );
        set.add("aa");
        set.add("aaaaab");
        set.add("aab"); // lexicographical
        set.add("Aaab");
        System.out.println(set);
    }
}
