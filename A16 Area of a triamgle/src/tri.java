import java.util.Scanner; 
import java.lang.Math.*;

public class tri
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
    Scanner keyboard = new Scanner(System.in);

	public tri()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public tri(int a, int b, int c)
	{
        sideA = a;
        sideB = b;
		sideC = c;
    
	}


	public void setSides(int a, int b, int c)
	{
        System.out.print("Enter side A::   ");
		a = keyboard.nextInt();
		System.out.print("Enter side B::   ");
		b = keyboard.nextInt();
		System.out.print("Enter side C::   ");

    


	}

	public void calcPerimeter(double perimeter)
	{
        perimeter = sideA + sideB + sideC;
		System.out.println("The perimeter is" + perimeter);




	}

	public void calcArea(double a, double b , double c )
	{
		double perimeter = sideA + sideB + sideC;
		double s = perimeter/2;
	    theArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area is"  + theArea);

		


	}

	public void print( )
	{


		System.out.println("\n\n");
	}
}