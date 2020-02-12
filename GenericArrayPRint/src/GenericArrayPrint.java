/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class GenericArrayPrint {
	public static <E> void display(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
	}
}
public static int prac(int n) {
	if (n==1) return 17;
	
	else { return prac(n-1)+5*(n+2); }
}


int sum = 0;
for (int i = 0; i < array.length; i++) {
	for (int k = 0; k < array[0].length) {
		sum = sum + array[i][k];
	}
}