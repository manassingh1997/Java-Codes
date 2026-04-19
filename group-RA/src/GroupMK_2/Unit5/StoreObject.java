package GroupMK_2.Unit5;
import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    transient String password = "123j";
    int roll = 2;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class StoreObject {
    public static void main(String[] args) throws IOException{
//        Student s = new Student("Manas", 1);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
//        oos.writeObject(s);
//        oos.writeObject(new Student("Person2", 2));
//        oos.writeObject(new Student("Person3", 3));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        while (true){
            try {
                Student s1 = (Student) ois.readObject();
                System.out.println(s1.age);
                System.out.println(s1.name);
                System.out.println(s1.password);
            } catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
