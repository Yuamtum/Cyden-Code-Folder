//Imports the Scanner Class into the program 
import java.util.Scanner;









public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
       

    //     System.out.println("Enter an integer:");
    //     int num = keys.nextInt();

    //     System.out.println("You chose the number " + num);

        System.out.print("What is your name? ");
        String name = keys.next();
        System.out.println("Your entered: " + name);
    }
}
