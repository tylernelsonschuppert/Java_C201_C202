/* 
 * Write your Name, date written here.
 * Name: Tyler Nelson
 * Date: 10/14/18
 */
import java.util.Scanner;
import java.util.Random;
public class Lab7Program {
   public static void main(String[] args) {
    //1. Create a double array that can hold 10 values
	double array [];
	array = new double[10];
    
    //2. Invoke the outputArray method, the double array is the actual argument.
	
	outputArray(array);
     
    //4. Initialize all array elements using random floating point numbers between 1.0 and 5.0, inclusive
    
	Random r = new Random();
	double x;
	for(int i = 0; i <= array.length - 1; i++) {
			x = 1.0 + (5.0 - 1.0) * r.nextDouble();
            array[i] = x;
    }
	
    //5. Invoke the outputArray method to display the contents of the array
	
	outputArray(array);
	
    
    //6. Set last element of the array with the value 5.5, use length to access last index.
	
	array[array.length - 1] = 5.5;
    
    //7. Invoke the outputArray method to display the contents of the array
    
	outputArray(array);
	
    //8. Allow user to input elements 2 through 6 through keyboard
	
	Scanner in;
	in = new Scanner(System.in);
	for (int i = 2; i <= 6; i++)
	{
		System.out.print("Please input value to assign to element [" + i + "]: ");
		array[i] = in.nextDouble();
	}
	System.out.println();
    
    //9. Invoke the outputArray method to display the contents of the array
    
	outputArray(array);
	
    //10. Compute the sum of all elements in the array
    
	double sum;
	sum = 0.0;
	for (int i = 0; i <= array.length - 1; i++)
	{
		sum = sum + array[i];
	}
	
    //11. Display the sum you found in step #10
	
	System.out.println("The sum of all elements in the array is " + sum);
	System.out.println();
    
    //12. Find the index of the smallest element in the array.
    
	double min;
	min = array[0];
	for (int i = 0; i <= array.length - 1; i++)
	{
		if (min > array[i])
		{
			min = array[i];
		}
	}
	System.out.println("The index of the smallest element in the array is " + linearSearch(array, min));
	System.out.println();
	
    //13. Display the index of the smallest element and the value of the
    //    smallest element.
	
	System.out.println("The index of the smallest element in the array is " + linearSearch(array, min) + " and the value of that element is " + array[linearSearch(array, min)]);
    System.out.println();
	
    //15. Invoke bubble sort method, the array is the actual argument.
	
	bubbleSort(array);
       
    //16. Invoke the outputArray method, the array is the actual argument.
	
	outputArray(array);
	
    //18. Invoke linearSearch method, search for value 5.5. Output a statement informing if the
    //    search value was found or not.
	
	if (linearSearch(array, 5.5) != -1)
	{
		System.out.println("The search value 5.5 was found at index " + linearSearch(array, 5.5));
	}
	else {
		System.out.println("The search value was not found.");
	}
       
   }
    
    // 3. Implement outputArray method that will display the contents of the array
    //     on a single line, elements separated by spaces.
    //     There should be an empty line in the output after the array elements.
   
   	public static void outputArray(double[] array) {
		int i = 0;
		for (double element : array) {
			if (i == array.length -1)
			{
				System.out.print(element);
			}
			else
			{
				System.out.print(element + " ");
				i++;
			}
		}
		System.out.println();
		System.out.println();
	}
    
    // 14. Implement bubble sort method here. The double type array is the formal parameter.
    
	public static void bubbleSort(double[] array) {
		double temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
				//swap the elements!
				temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
				}
			}
		}
	}
	
    // 17. Implement linearSearch method here. The double type array and search value are the formal parameters.
	
	public static int linearSearch(double[] array, double key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i; // key is found at index i
			}
		}
		return -1; // key int found
	}
}
/*
 * Copy and paste your program output here
 */

/*
run:
0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0

2.2750459130406813 3.438586350347718 4.605048189881507 4.516920430927174 1.6879622443825921 1.16904023042623 4.310001531769604 3.1986785009376257 3.879685241892875 2.30169808168913

2.2750459130406813 3.438586350347718 4.605048189881507 4.516920430927174 1.6879622443825921 1.16904023042623 4.310001531769604 3.1986785009376257 3.879685241892875 5.5

Please input value to assign to element [2]: 1.2
Please input value to assign to element [3]: 1.3
Please input value to assign to element [4]: 1.4
Please input value to assign to element [5]: 1.5
Please input value to assign to element [6]: 1.6

2.2750459130406813 3.438586350347718 1.2 1.3 1.4 1.5 1.6 3.1986785009376257 3.879685241892875 5.5

The sum of all elements in the array is 25.291996006218902

The index of the smallest element in the array is 2

The index of the smallest element in the array is 2 and the value of that element is 1.2

1.2 1.3 1.4 1.5 1.6 2.2750459130406813 3.1986785009376257 3.438586350347718 3.879685241892875 5.5

The search value 5.5 was found at index 9
BUILD SUCCESSFUL (total time: 7 seconds)
*/