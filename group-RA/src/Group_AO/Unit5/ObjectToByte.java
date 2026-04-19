package Group_AO.Unit5;
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int roll_no;
    String name;
    transient String password = "123h";
    //int age = 18;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class ObjectToByte {
    public static void main(String[] args) throws IOException{
//        Student s = new Student(1,"Manas");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
//        oos.writeObject(s);
//        oos.writeObject(new Student(2,"Your Name"));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        while (true) {
            try {
                Student s1 = (Student) ois.readObject();
                System.out.println(s1.name);
                System.out.println(s1.roll_no);
            } catch (Exception e){
                System.out.println("No More Data: " + e.getMessage());
                break;
            }
        }

    }
}
