package GroupRA.Unit5;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 2L;
    int roll;
    String name;
    transient String password = "123";
    int age = 20;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}
public class ByteToObject {
    public static void main(String[] args) {
//        Student s = new Student(1, "Manas");
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"))) {
//            oos.writeObject(s);
//            oos.writeObject(new Student(2, "Singh"));
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"))){
            while (true) {
                try {
                    Student s1 = (Student) ois.readObject();
                    System.out.println(s1.name);
                    System.out.println(s1.roll);
                    System.out.println(s1.password);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
