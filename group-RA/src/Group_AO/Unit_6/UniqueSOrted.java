package Group_AO.Unit_6;

import java.util.Comparator;
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
        return name;
    }
}

public class UniqueSOrted {
    public static void main(String[] args){
        TreeSet<Person> p_set = new TreeSet<>(
                (a,b) -> b.name.compareTo(a.name)
        );
        p_set.add(new Person(18,"zabc"));
        p_set.add(new Person(123,"bac"));
        p_set.add(new Person(34,"xyz"));
        p_set.add(new Person(33,"ancd"));
        System.out.println(p_set);
        TreeSet<String> ord_set = new TreeSet<>();
        ord_set.add("xya");
        ord_set.add("aa");
        ord_set.add("xay");
        System.out.println(ord_set);
    }
}
