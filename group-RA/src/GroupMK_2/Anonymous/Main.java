package GroupMK_2.Anonymous;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal() {
            void sound(){
                System.out.println("Dog barking");
            }
        };
        a.sound();
    }
}
