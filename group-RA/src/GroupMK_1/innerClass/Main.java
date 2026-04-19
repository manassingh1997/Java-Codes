package GroupMK_1.innerClass;

public class Main {
    public static void main(String[] args){
        Student stu = new Student("Manas",26);
        Student.Subject s1 = stu.new Subject("Programming With Java",66);
        s1.show();
    }//class Student: name, roll_no
    // class Subject: sub_name, marks
}
