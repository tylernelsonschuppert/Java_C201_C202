/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class Lab4 {
	public static long factorial(int n) {
		if (n == 0) { // Base case
			return 1;
		}
		else {
			return n * factorial(n - 1); // Recursive call
		}
	}
	public static long fibonacci(long index) {
		if (index == 0) { // Base case
			return 0;
		}
		else if (index == 1) { // Base case
			return 1;
		}
		else { // Reduction and recursive calls
			return fibonacci(index - 1) + fibonacci(index - 2);
		}
	}
	public static int power(int base, int exp) {
		if ( exp == 0 ) { // Base Case
			return 1;
		}
		return (base*power(base,exp-1)); // Recursive Call
	}
	public static int digitSum(int num){
		int sum=0;
		if (num == 0) { // Base Case
			return sum;
		}
        sum = num % 10 + digitSum(num/10); // Recursive Call
		return sum;
	}
	public static int digitCount(int n) 
	{ 
		if (n == 0) { return 0; }
		return 1 + digitCount(n / 10); // Recursive Call
	} 
	public static int power2(int base, int exp) {
		System.out.println("Power2(" + base + ", " + exp + ")");
		if (exp==0) { return 1; }
		else if (exp%2 != 0) {
			return base*power2(base,exp-1);
		}
		else {
		return (power2(base,exp/2))*(power2(base,exp/2));
		}
	}
	public static void selectionSort(int[] list, int low, int high) {
		System.out.println("Recursive Selection Sort with low " + low + " and high " + high);
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
			list[smallestIndex] = list[low];
			list[low]=min;
			selectionSort(list, low+1, high);
		}
	}
	public static int recursiveBinarySearch(int[] list, int key) {
		System.out.println("In the call method");
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);
	}
	private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		System.out.println("In helper rBS");
		System.out.println("low: " + low + " High: " + high);
		if (low > high) {
			return -low - 1;
		}
		int mid = (low + high) / 2;
		if (key < list[mid]) {
			return recursiveBinarySearch(list, key, low, mid - 1);
		}
		else if (key == list[mid]) {
				return mid;
		}
		else {
			return recursiveBinarySearch(list, key, mid + 1, high);
		}
	}

	public static void main(String[] args) {
		System.out.println("Testing factorial of 10: " + factorial(10));
		System.out.println("Testing fibonnaci of 15: " + fibonacci(15));
		System.out.println("Testing sum of digits 1, 2, 3, 4, 5: " + digitSum(12345));
		System.out.println("Testing digit count with number 1234567890: " + digitCount(1234567890));
		System.out.println("Testing Power2 using (2, 3): " + power(2,3));
		
		// Create a random array of 50 integers between 1 and 1000
		System.out.println("Creating a random array of 50 integers between 1 and 1000.");
		int[] randArray;
		randArray = new int[50];
		
		for (int i = 0; i < randArray.length; i++) {
			int random = (int)(Math.random() * 1000 + 1);
			randArray[i] = random;
			System.out.println("Value of randArray[" + i + "]: " + randArray[i]);
		}
		
		System.out.println("Testing recursive selection sort using randArray.");
		
		selectionSort(randArray, 1, 20);
		
		System.out.println("Testing recursive binary search using randArray.");
		recursiveBinarySearch(randArray, 50, 1, 49);
	}
}
