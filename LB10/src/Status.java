/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.awt.*;
public class Status
{
	//Attributes
	protected double o1;
	protected double o2;
	protected char o;
	protected Color c;
	protected String t;
	
	//Constructors
	public Status()
	{
		//seto1();
	}
	public Status(double n1, double n2, char p, Color d, String e)
	{
		o1 = n1;
		o2 = n2;
		o = p;
		c = d;
		t = e;
	}
	
	//Methods
	public void seto1(double n1)
	{
		o1 = n1;
	}
	public void seto2(double n2)
	{
		o2 = n2;
	}
	public void seto(char p)
	{
		o = p;
	}
	public void setc(Color d)
	{
		c = d;
	}
	public void sett(String e)
	{
		t = e;
	}
	public double geto1()
	{
		return o1;
	}
	public double geto2()
	{
		return o2;
	}
	public char geto()
	{
		return o;
	}
	public Color getc()
	{
		return c;
	}
	public String gett()
	{
		return t;
	}
}
