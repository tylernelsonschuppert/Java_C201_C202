/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version LB03 Version 4.0
 * @since 9/16/18
 */

import javax.swing.*;

public class EasyMonogram
{
	//Attributes
	private String firstName;
	private String middleName;
	private String lastName;
	
	//Constructors
	public EasyMonogram()
	{
		firstName = JOptionPane.showInputDialog(null,"Type in your first name.");
		middleName = JOptionPane.showInputDialog(null,"Type in your middle name.");
		lastName = JOptionPane.showInputDialog(null,"Type in your last name.");
	}

	//Methods
	public String getInitial(String name)
	{
		return name.substring(0,1);
	}
	public void setMonogram()
	{
		String monogram;
		monogram = getInitial(firstName) + getInitial(middleName) + getInitial(lastName);
		JOptionPane.showMessageDialog(null, monogram);
	} 
	public static void main(String[] args)
	{
		EasyMonogram myMonogram;
		myMonogram = new EasyMonogram();
		myMonogram.setMonogram();
	}
}