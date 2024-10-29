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
        a = sideA;
        b = sideB;
        c = sideC;
    
	}


	public void setSides(int a, int b, int c)
	{
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
    


	}

	public void calcPerimeter( )
	{
        



	}

	public void calcArea( )
	{
		double s;
		


	}

	public void print( )
	{


		System.out.println("\n\n");
	}
}