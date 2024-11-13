import java.util.Scanner;

public class App {
    public static void main( String args[]) {
    leap test = new leap();
        Scanner keyboard = new Scanner(System.in);
        int year;

        System.out.println("Give a year::  ");
        year = keyboard.nextInt();
        
        System.out.println(test.isLeap(year));

        
    }
}
