package GroupMK_1.Unit5;
import java.io.*;
class Student implements Serializable{
    int roll;
    String name;
    transient String password = "123";
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}
public class ObjectToByte {
    public static void main(String[] args) throws IOException {
        Student s = new Student(1, "Name kumar");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        oos.writeObject(s);
        oos.writeObject(new Student(2,"Hello Wolrd"));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        while (true){
            try {
                Student s1 = (Student) ois.readObject();
                System.out.println(s1.password);
            } catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
