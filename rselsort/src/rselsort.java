/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class rselsort {
	public static void rselsort(int[] list, int low, int high) {
		System.out.println("recSelSort with low " + low + "and high " + high);
		if (low <high) {
			//get smallest
			int smallestIndex = low;
			int min=list[low];
			for (int i = low + 1; i <= high; i++) {
				if(list[i] < min) {
					min = list[i];
					smallestIndex = i;
					System.out.println("New smallest " + min);
				}
			}
		}
		//swap
		list[smallestIndex] = list[low];
		list[low]=min;
		rselsort(list, low+1, high);
	}
}