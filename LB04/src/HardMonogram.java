/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version LB04 Version 1.0
 * @since 9/23/18
 */

import javax.swing.*;

public class HardMonogram
{
	//Attributes
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	
	//Constructors
	public HardMonogram()
	{
		fullName = JOptionPane.showInputDialog(null,"Type in your full name.");
	}

	//Methods
	public void getSeparateName()
	{
		firstName = fullName.substring(0, fullName.indexOf(" "));
		middleName = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
		lastName = middleName.substring(middleName.indexOf(" ") + 1, middleName.length());
	}
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
		HardMonogram myMonogram;
		myMonogram = new HardMonogram();
		myMonogram.getSeparateName();
		myMonogram.setMonogram();
	}
}