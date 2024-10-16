public class Celf {
    private double fa;

	public void setFahrenheit(double fahren)
	{
        fa = fahren;
    
	}

	public double getCelsius()
	{
		double celsius = (fa - 32) * 9/5;
		return celsius;
	}

	public void print()
	{
		System.out.println(getCelsius());
	}
}


