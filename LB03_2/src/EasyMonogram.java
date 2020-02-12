/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EasyMonogram {
	//attributes
	private String fn;  //first name
	private String mn;  //middle name
	private String ln;  //last name
	private String mg;  //monogram
	
	//constructors
	public EasyMonogram() {
		/*
		// initialize first, middle, and last name using JOptionPane
		Scanner s;
		s = new Scanner(System.in);
		System.out.print("Type in your first name: ");
		fn = s.next();
		System.out.print("Type in your middle name: ");
		mn = s.next();
		System.out.print("Type in your last name: ");
		ln = s.next();
		*/
		
		fn = JOptionPane.showInputDialog(null, "Type in your first name: ");
		mn = JOptionPane.showInputDialog(null, "Type in your middle name: ");
		ln = JOptionPane.showInputDialog(null, "Type in your last name: ");
	}
	//methods

	// getInitial(name): extract the first character string from each part of a full name and return it.
	
	public String getInitial(String name) {
		return name.substring(0,1);
	}
	public void setMonogram() {
		mg = getInitial(fn) + getInitial(mn) + getInitial(ln);
	//	System.out.println(mg);
		JOptionPane.showMessageDialog(null, mg);
	}
	public static void main(String[] args) {
		EasyMonogram easy;
		easy = new EasyMonogram();
		easy.setMonogram();
	}
}
