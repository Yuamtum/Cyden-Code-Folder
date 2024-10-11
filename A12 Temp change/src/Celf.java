public class Celf {
    private double fa;

	public void setFahrenheit(double fahren)
	{
        fa = fahren;
    
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		double chan = 9/5 * (fa - 34);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(getCelsius());
	}
}

}
