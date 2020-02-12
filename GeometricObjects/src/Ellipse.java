
// Complete all methods
// Add JavaDoc with explanations.

public class Ellipse extends GeometricObject implements Eccentric, Comparable, Cloneable {
	
	double a, b;
	public Ellipse(double s1, double s2)
	{
		if(s1 < s2)
		{
			a = s2;
			b = s1;
		}
		else
		{
			a = s1;
			b = s2;
		}
	}
	
	public double perimeter()
	{
		//method body missing
	}
	
	public double area()
	{
		//method body missing		
	}
	
	public double eccentricity()
	{
		//method body missing		
	}
	
	public String toString()
	{
		//method body missing
	}
}
