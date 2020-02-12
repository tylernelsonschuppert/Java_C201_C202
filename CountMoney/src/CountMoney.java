/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.util.*;
public class CountMoney {
	public static void main(String[] args) {
	int quarter = 25;
	int dime = 10;
	int nickel = 5;
	int nq;
	int nd;
	int nn;
	Scanner in = new Scanner(System.in);
	System.out.print("Please input the number of quarters: ");
	nq = in.nextInt();
	System.out.print("Please input the number of nickels: ");
	nn = in.nextInt();
	System.out.print("Please input the number of dimes: ");
	nd = in.nextInt();
	System.out.println("The coins are worth " + ((nq*quarter) + (nd * dime) + (nn*nickel)) + " cents.");
	}
}
