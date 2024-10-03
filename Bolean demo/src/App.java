public class App {
    public static void main(String[] args) throws Exception {
     int x = 2;
     int y = 3;

     // NOT ( A & B) Short Circuit Law
     // !(X > 0 && y < 2)

        if (!(x > 0) || ! (y < 2)) {
            System.out.println("wear a coat");
            System.out.println("wear gloves");
        }
          
        System.out.println("Bye");


    
    }
}
