package Group_AO.Static_Class;

public class Main {
    public static void main(String[] args){
        Outer obj = new Outer();
        obj.show();
        Outer.Inner in1 = new Outer.Inner();
        in1.display();
    }
}
