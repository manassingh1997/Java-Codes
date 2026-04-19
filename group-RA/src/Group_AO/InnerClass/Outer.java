package Group_AO.InnerClass;

public class Outer {
    static int var = 10;
    static int number = 20;
    static class Inner{
        void show(){
            System.out.println("Hello Inner var = "+ var+" static = "+ number);
        }
    }
}
