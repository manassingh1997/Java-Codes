package GroupRA.StaticClass;

public class Outer {
    static int number = 10;

    static class Inner {
        void show(){
            System.out.println(number);
        }
    }
}
