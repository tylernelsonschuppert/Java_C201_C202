/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class Lab3 {
	public static void main(String[] args) throws Exception {
		
		// 10. Instantiate several Matrix objects of different rows/columns.
		System.out.println("Creating new Matrix object m1 with 5 rows, 5 columns...");
		Matrix m1 = new Matrix(5,5);
		System.out.println("Creating new Matrix object m2 with 5 rows, 2 columns...");		
		Matrix m2 = new Matrix(5,6);
		System.out.println("Creating new Matrix object m3 with 10 rows, 15 columns...");
		Matrix m3 = new Matrix(10,15);
		System.out.println("Creating new Matrix object m4 with 13 rows, 13 columns...");
		Matrix m4 = new Matrix(13,13);
		
		// 11. Make a matrix copy of an existing matrix.
		System.out.println("Copying Matrix Object m4 to Matrix Object m5copy...");
		Matrix m5copy = m4.copyMatrix();
		
		// 12. Test the equals method with Matrix objects that are actually equal,
		// and with Matrix objects that are not equal. Must output properly labeled
		// statement.
		System.out.println("Testing if Matrix Object m4 equals Matrix Object m5copy... answer is: " + m4.equals(m5copy));
		System.out.println("Testing if Matrix Object m1 equals Matrix Object m2... answer is: " + m1.equals(m2));
		
		// 13.  Display several of the objects using the toString method
		System.out.println("Displaying m1...");
		System.out.println("");
		System.out.println(m1);
		
		System.out.println("Displaying m2...");
		System.out.println("");
		System.out.println(m2);
		
		System.out.println("Displaying m3...");
		System.out.println("");
		System.out.println(m3);
		
		System.out.println("Displaying m4...");
		System.out.println("");
		System.out.println(m4);
		
		System.out.println("Displaying m5copy...");
		System.out.println("");
		System.out.println(m5copy);
		
		// 14. Display a matrix object that is before and after multiplying by a
		// valid integer scalar value using scalarMultiply
		
		System.out.println("Matrix Object m1 before multiplying by Scalar Value 2...");
		System.out.println(m1);
		System.out.println("Matrix Object m1 after multiplying by Scalar value 2...");
		System.out.println(m1.scalarMultiply(2));
		
		// 15. Display a matrix object that is before and after multiplying by 0
		// as the scalar value.
		
		System.out.println("Matrix Object m3 before multiplying by Scalar Value 0...");
		System.out.println(m3);
		System.out.println("Matrix Object m3 after multiplying by Scalar Value 0...");
		System.out.println(m3.scalarMultiply(0));
		
		// 16. Test  the  method   multiply  wirh Matrix  by  Matrix  multiplication
		// with  at  least  three  sets  of  different  Matrix  objects  that  test 
		// different outcomes  of  the  method,  including  theException.  Know  your
		// answers BEFORE you test!
		
		System.out.println("m1 times m2...");
		System.out.println(m1.multiply(m2));
		
		System.out.println("m1 times m4...");
		System.out.println(m1.multiply(m4));
		
		System.out.println("m4 times m3... this will be a row/column mismatch...");
		System.out.println(m4.multiply(m3));
	}
}
