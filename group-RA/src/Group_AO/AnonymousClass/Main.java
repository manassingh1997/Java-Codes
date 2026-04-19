package Group_AO.AnonymousClass;

interface Operations {
    void operate(int x);
}
public class Main {
    public static void main(String[] args){
        Operations square = new Operations() {
            public void operate(int x) {
                System.out.println("Square: " + x*x);
            }
        };
        square.operate(6);
        Operations cube = new Operations() {
            public void operate(int x) {
                System.out.println("Cube: " + x*x*x);
            }
        };
        cube.operate(3);
    }
}



