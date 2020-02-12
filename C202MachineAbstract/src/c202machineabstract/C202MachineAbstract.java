/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c202machineabstract;

/**
 *
 * @author tylernelson
 */
public class C202MachineAbstract {
	public static void main(String[] args) {
		Machine c1 = new Car("Ford","Windstar",100000);
		
		c1.setValue(500);
		c1.setColor("Red");
		c1.setLoan(true);
		c1.move();
		System.out.println(c1);
		System.out.println("");
		
		Boat b1 = new Boat(350,2000);
		b1.move();
		b1.setValue(20000);
		b1.setLocation("Lake");
		System.out.println(b1);
		System.out.println("");
		
		Plane p1 = new Plane();
		p1.setHours(2000);
		
		p1.setColor("Blue");
		p1.setLocation("Haps");
		p1.setValue(300000);
		p1.setLoan(true);
		p1.move();
		System.out.println(p1);
		
		Helicopter h1 = new Helicopter("Mercedes-Benz", "EC14", 1000);
		h1.setColor("Black");
		h1.setLocation("Army Base");
		h1.setValue(1000000);
		h1.setLoan(false);
		h1.move();
		System.out.println(h1);
		
		Machine[] arrayOfStuff = new Machine[20];
		
		for(int i = 0; i < arrayOfStuff.length; i++) {
			int pick = (int)(4*Math.random()+1);
			if(pick == 1)
			{arrayOfStuff[i] = new Boat(i*10,i*100);}
			if(pick == 2)
			{arrayOfStuff[i] = new Car();}
			if(pick == 3)
			{arrayOfStuff[i] = new Plane();}
			if(pick == 4)
			{arrayOfStuff[i] = new Helicopter();}
		}
		
		for(int i = 0; i < arrayOfStuff.length; i++) {
			arrayOfStuff[i].move();
		}

//		System.out.println("We have a " + arrayOfStuff[1].holdings());
	}
}