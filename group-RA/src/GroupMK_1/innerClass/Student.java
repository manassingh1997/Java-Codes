package GroupMK_1.innerClass;

public class Student {
    String name;
    int roll_no;
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    class Subject{
        String sub_name;
        int marks ;
        Subject(String sub_name, int marks){
            this.sub_name = sub_name;
            this.marks = marks;
        }

        void show(){
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+ roll_no);
            System.out.println("Subject: "+sub_name);
            System.out.println("Marks: "+marks);
        }
    }
}
