import java.util.Scanner; 
import java.lang.Math.*;

public class App  
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();


		tri test = new tri(a, b, c);
		test.calcPerimeter(c);
		test.calcArea(a, b, c);

		test.print();


		
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		test.setSides(a,b,c);
		test.calcPerimeter(c);
		test.calcArea(a, b, c);
		test.print();


	




	}
}