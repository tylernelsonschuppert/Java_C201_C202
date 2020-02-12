/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version LB03
 * @since 9/16/18
 */

import javax.swing.*;

public class Driver {
	//Attributes
	
	//Constructors
	
	//Methods
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		String initials;
		char firstInitial;
		char middleInitial;
		char lastInitial;
		String firstInitialStr;
		String middleInitialStr;
		String lastInitialStr;
		
		firstName = JOptionPane.showInputDialog(null,"Type in your first name.");
		middleName = JOptionPane.showInputDialog(null,"Type in your middle name.");
		lastName = JOptionPane.showInputDialog(null,"Type in your last name.");
		firstInitial = firstName.charAt(0);
		middleInitial = middleName.charAt(0);
		lastInitial = lastName.charAt(0);
		initials = Character.toString(firstInitial) + Character.toString(middleInitial) + Character.toString(lastInitial);

		JOptionPane.showMessageDialog(null,initials);	
	}
}