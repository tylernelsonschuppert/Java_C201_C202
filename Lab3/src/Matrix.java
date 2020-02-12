/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */


public class Matrix {
	//Attributes
	private int r; //rows
	private int c; //columns
	private int[][] data; //2 dimensional array
	
	//Constructors
	public Matrix(int row, int col) {
		r = row;
		c = col;
		data = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = (int)(Math.random()*100+1);
			}
		}
		System.out.println("The matrix is loaded...");
	}
	
	//Methods
	public String toString() {
		String ans = "";
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ans = ans + data[i][j] + "\t";
			}
			ans = ans + "\n";
		}
		return ans;
	}
	
	public Matrix copyMatrix() {
		Matrix ans = new Matrix(this.r, this.c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ans.data[i][j] = data[i][j];  // deep copy of the matrix
			}
		}
		System.out.println("Matrix copied...");
		return ans;	
	}
				
	
	public boolean equals(Matrix a) {
		boolean ans = true;
		
		if ((a.r != this.r)||(a.c != this.c))  {
			ans = false;
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a.data[i][j] != data[i][j]) {
					ans = false;
				}
			}
		}
		return ans;
	}
	
	public Matrix scalarMultiply(int a) {
		Matrix ans = new Matrix(this.r ,this.c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ans.data[i][j] = data[i][j]*a;
			}
		}
		return ans;
	}

	public Matrix multiply(Matrix m2) throws Exception {
		try{
			if(this.c != m2.r){
				System.out.println("Row col miss match");
			}
			Matrix m3 = new Matrix(this.r, m2.c);
			
			for (int i = 0; i < this.r; i++) {
				for (int j = 0; j < m2.c; j++) {
					m3.data[i][j]=0; //set to zero to rid of old data
					for (int k = 0; k < this.c; k++) {
						m3.data[i][j] += data[i][k]*m2.data[k][j];
					}
				}
			}
			return m3;
		}
		catch(Exception ex) {
			System.out.println("Argh!" + ex);
		}
		return null;
	}
}

//isequal = first check rows equals rows, second check columns equal columns
//if they are equal, go through line/by line to test