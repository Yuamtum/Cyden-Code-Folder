// Input and Output
// Sept 25, 2024
// Cyden Dusaran

import java.lang.System;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
      
      Scanner keys = new Scanner(System.in);
      
      
        System.out.println("Enter an integer: ");
      int num1 = keys.nextInt();
      System.out.println("Enter another integer: ");
      int num2 = keys.nextInt();
      
      System.out.println("You chose the numbers : " + num1 + " and " + num2);
      int sum = num1 + num2;
      System.out.println(" The sum of the two integers is : " + " " + sum);

      System.out.println(" Enter a double : ");
      Double woe1 = keys.nextDouble();
      System.out.println("Enter another double: ");
      Double woe2 = keys.nextDouble();

      System.out.println("You chose the doublesL: " + woe1 + " and " + woe2);
      Double tot = woe1 + woe2;
      System.out.println(" The sum of the two doubles is: " + tot);


    }
}
