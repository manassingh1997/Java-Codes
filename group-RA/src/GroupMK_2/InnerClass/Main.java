package GroupMK_2.InnerClass;

public class Main {
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner in1 = obj.new Inner();
        in1.show();
    }
}
