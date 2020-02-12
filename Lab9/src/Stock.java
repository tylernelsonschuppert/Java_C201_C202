/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class Stock
{
	//Attributes
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	//Constructors
	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	//Methods
	public void setPreviousClosingPrice(double p)
	{
		previousClosingPrice = p;
	}
	
	public void setCurrentPrice(double c)
	{
		currentPrice = c;
	}
	
	public double getChangePercent()
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100; 
	}
	
	public String getSymbol()
	{
		return symbol;
	}
}
