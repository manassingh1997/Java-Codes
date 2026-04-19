package Group_AO.FunctionalInterface;

interface Operation {
    void operate(int x, int y);
}

public class Calc {
    public static void main(String[] args){
        Operation add = (x,y) -> System.out.println("Addition: "+(x+y));
        add.operate(7,5);
    }
}
