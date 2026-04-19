package com.manas.core.Unit5;

import java.io.*;

class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    int id;
    String name;
    transient String password;
    int age;

    Student(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class ByteToObject {
    public static void main(String[] args) throws Exception{
//        Student s = new Student(1, "manas", "123");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
//        oos.writeObject(s);
//        oos.writeObject(new Student(2,"Singh","334"));
//        oos.writeObject(new Student(3,"Hello","765"));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        while (true) {
            try {
                Student s1 = (Student) ois.readObject();
                System.out.println(s1.age);
            } catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
