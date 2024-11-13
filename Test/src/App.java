import java.util.Scanner;



public class App {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a year::  ");
        int a = keyboard.nextInt();

        int b = a % 400;
        System.out.println(b);

    
    }
}
