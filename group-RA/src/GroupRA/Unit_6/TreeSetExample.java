package GroupRA.Unit_6;
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
public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Person> set = new TreeSet<>(
                (a,b) -> b.age - a.age
        );
        set.add(new Person("AAAAAABC", 80));
        set.add(new Person("BCD", 19));
        set.add(new Person("abc", 77));
        //set.remove(2);
        //set.clear();
        if(set.isEmpty()) System.out.println("True no set");
        System.out.println(set);
        //if(set.contains(19)) System.out.println("Yes it exists");
        TreeSet<Person> set1 = new TreeSet<>(Comparator.reverseOrder());
        set1.add(new Person("AAAAAABC", 80));
        set1.add(new Person("BCD", 19));
        set1.add(new Person("abc", 77));
        System.out.println("Reversed: " + set1);
    }
}
