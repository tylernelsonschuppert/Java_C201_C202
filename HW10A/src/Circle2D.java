/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version HW10A
 * @since 11/18/18
 */
public class Circle2D {
	//Attributes
	private double x;
	private double y;
	private double radius;
	
	//Constructors
	public Circle2D()
	{
		this(0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//Methods
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getArea()
	{
		return (Math.PI * radius * radius);
	}
	
	public double getPerimeter()
	{
		return (2 * Math.PI * radius);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}
	
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
}