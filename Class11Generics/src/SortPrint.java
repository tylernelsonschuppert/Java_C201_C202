/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class SortPrint {
	public static <E> void show (E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}
		System.out.println("\n\n");
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		boolean done = false;
		while (!done) {
			done = true;
			for (int i = 0; i < list.length - 1; i++) {
				if(list[i].compareTo(list[i+1]) > 0) {
					E temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					done = false;
					System.out.println("Swapping...");
				}			
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {4,5,6,3,2,6,7,9,12,45,78,7};
		Double[] b = {1.2, 3.4, 1.3, 5.6, 7.8, 8.9, 4.3, 2.1};
		Character[] c = {'u', 'w', 'a', 'r', 'b', 'd'};
		String[] d = {"Nelson", "Yanet", "Jordan", "Jim"};
		
		System.out.println("(A) Before sort.");
		show(a);
		bubbleSort(a);
		System.out.println("(A) After sort.");
		show(a);
		
		System.out.println("(B) Before sort.");
		show(b);
		bubbleSort(b);
		System.out.println("(B) After sort.");
		show(b);

		System.out.println("(C) Before sort.");
		show(c);
		bubbleSort(c);
		System.out.println("(C) After sort.");
		show(c);
		
		System.out.println("(D) Before sort.");
		show(d);
		bubbleSort(d);
		System.out.println("(D) After short.");
		show(d);
	}
}