package GroupRA.Package;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal() {
          void speak(){
              System.out.println("Hello");
          }
        };
        a.speak();
    }
}
