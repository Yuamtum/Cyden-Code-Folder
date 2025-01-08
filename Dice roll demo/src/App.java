import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random ran = new Random();
        int numRolls;
        int[] outcomes;
        int current;

        System.out.println("How many dice do you want to roll?");
        numRolls = keys.nextInt();
        outcomes = new int[numRolls]; // create position for each 

        for(int roll = 0; roll < numRolls; roll++) {
            //Rolling "Two dice" -note nextInt(x) is a 
            // number from 0 < num < x
            int d1 = ran.nextInt(6) + 1;
            int d2 = ran.nextInt(6) + 1;
            outcomes[roll] = d1 + d2;
            System.out.println("Roll number " + roll + " - D1 = " + d1 + " D2 = "+ d2);
            

            System.out.println("\nThe Game Stats; ");
            int total = 0;
            double average = 0;
            for(int i = 0; i < numRolls; i++) {
                total = total + outcomes[i];
                average = total/outcomes[i];
                System.out.println("Total score: " + total);
                System.out.println("The average is: " + average);
            } 
        }
    }

}
