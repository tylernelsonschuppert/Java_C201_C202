/*
 * Author: Tyler Nelson
 * Date: 10/28/18
 * Program: Lab8Program.java
 * Demonstrate Two Dimensional Arrays.
 * Purpose: 
 * You are required to write purpose of each method here
 * populateMatrix: initializes a two dimensional array -- all elements are assigned a random integer value between 1 and 9
 * outputMatrix: displays all element values for the two dimensional array created above -- prints out 3 columns by 3 rows
 * findLocationOfLargest: finds and returns the indexed location of the largest element in the two dimensional array
 * getDiagonal: returns the value of the diagonal elements within the two dimensional array, startion from top left, to bottom right
 * transpose: swaps the rows and columns of the array
 * find: finds the index location of the supplied element
 * sortedRow: sorts a given row 
 * rowSum: adds the sum of all 3 rows
 * matrixCopy: copies an entire 2 dimensional array to another array
 */

public class Lab8Program{
    
    public static void main(String[] args){
    
		
        //Instantiate a two dimensional array of type int with 3 rows and 3 columns, call it matrix.
		int[][] matrix;
		matrix = new int[3][3];
		
        //invoke populateMatrix method, pass matrix as argument.
        populateMatrix(matrix);
		
        System.out.println("\nMatrix after populating");
        //invoke outputMatrix method, pass matrix as argument.
        outputMatrix(matrix);
		
        /*invoke findLocationOfLargest method, pass matrix as argument. Store the returned array
         in a single dimensional array reference called largestlocation.
         */
        findLocationOfLargest(matrix);
		
        System.out.println("\nThe maximum value of the matrix is at following location (row,column)");
         //invoke outputArray method, pass largestlocation array as argument.
        outputArray(findLocationOfLargest(matrix));
		 
        /*invoke getDiagonal method, pass matrix as argument. Store the returned array
          in a single dimensional array reference called diagonal.
    	*/
		getDiagonal(matrix);
        
        System.out.println("\nThe diagonal of the matrix contains following values");
        //invoke outputArray method, pass diagonal array as argument.
        outputArray(getDiagonal(matrix));
        
        /*invoke transpose method, pass matrix as argument. Store the returned 2D array
         in a reference called transposed.
         */
		transpose(matrix);
        
        System.out.println("\nThe resulting matrix after transposing original matrix");
         //invoke outputMatrix method, pass transposed array as argument.
        outputMatrix(transpose(matrix));
		 
        /*invoke find method, pass matrix and key value 5 as arguments. Store the returned array
         in a single dimensional array reference called position.
         */
		find(matrix, 5);
        
        System.out.println("\n The key value 5 is found at following location (row,column), \n (-1,-1) signifies nonexistence of search value.");
        //invoke outputArray method, pass position array as argument.
		outputArray(find(matrix, 5));
        
        /*invoke sortedRow method, pass matrix and row value 2 as arguments. 
         */
		sortedRow(matrix, 2);
        
        System.out.println("\nAfter sorting second row of the matrix");
        //invoke outputArray method, pass matrix[2] as argument.
		outputArray(matrix[2]);
        
        /*invoke rowSum method, pass matrix as argument. Store the returned array
         in a single dimensional array reference called sums.
         */
        rowSum(matrix);
		
        System.out.println("\nThe sums of each row are... ");
        //invoke outputArray method, pass sums array as argument.
		outputArray(rowSum(matrix));
        
        /*invoke matrixCopy method, pass matrix as argument. Store the returned 2D array
         in a reference called matrixCopy.
         */
        matrixCopy(matrix);
		
        System.out.println("\nThe copy of the original matrix is...");
         //invoke outputMatrix method, pass matrixCopy array as argument.
        outputMatrix(matrixCopy(matrix));
    		 
	}
    
    /* populate the 2D array with random integers between 1 and 9
    */
    public static void populateMatrix(int[][] data){
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				data[y][x] = (int)(Math.random()*9 + 1);
			}
		}
    }
    
    /* Output the 2D array to screen in following format
      Assume array contains following data,
      1 3 5
      2 4 6
      8 9 7
    */
    public static void outputMatrix(int[][] data){
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				System.out.print(data[y][x] + " ");
			}
		System.out.println();
		}
    }

    
    /* Returns the location of largest element of the 2D array.
    This location is stored in an array of two elements, where
    location[0] is the row, location[1] is the column.
    
    Example
    data[][] =  1 3 5      location[] = 2 0
                2 4 6
                9 7 2
    */
    public static int[] findLocationOfLargest(int[][] data){
		int maxValue = 0;
		int[] largestLocation;
		largestLocation = new int[2];
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				if (data[y][x] > maxValue)
				{
					maxValue = data[y][x];
					largestLocation[0] = y;
					largestLocation[1] = x;
				}
			}
		}
		return largestLocation;
	}
    	
    /* Returns the diagonal elements of a 2D array.
       Example
       data[][] = 1 3 5      diagonal[] = 1 4 9
                  2 4 6
                  3 7 9
         
     */
    public static int[] getDiagonal(int[][] data){
		int[] diagonal;
		diagonal = new int[3];
		for (int y = 0; y <= data.length - 1; y++)
		{
			if ( y == 0 ) { diagonal[0] = data[y][0]; }
			if ( y == 1 ) { diagonal[1] = data[y][1]; }
			if ( y == 2 ) { diagonal[2] = data[y][2]; }
		}
		return diagonal;
	}

    /* Returns the transpose of the data array. You are changing row/column order to column/row order.
	   Example
	   data = 1 3 5    data^T = 1 2 8
	          2 4 6             3 4 9
	          8 9 7             5 6 7
    */
    public static int[][] transpose(int[][] data){
		int[][] transposed;
		transposed = new int[3][3];
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				transposed[y][x] = data[y][x];
			}
		}
		transposed[0][0] = data[0][0];
		transposed[0][1] = data[1][0];
		transposed[0][2] = data[2][0];
		transposed[1][0] = data[0][1];
		transposed[1][1] = data[1][1];
		transposed[1][2] = data[2][1];
		transposed[2][0] = data[0][2];
		transposed[2][1] = data[1][2];
		transposed[2][2] = data[2][2];
		return transposed;
    }
    	
    /* Returns the location of search key
     Example
     data[][] =  1 3 5   key = 6   location[] = 1 2
                 2 4 6
                 9 7 2
    */
    public static int[] find(int[][] data, int key){
		int[] position;
		position = new int[2];
		position[0] = -1;
		position[1] = -1;
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				if (data[y][x] == key)
				{
					position[0] = y;
					position[1] = x;
				}
			}
		}
		return position;
    }
    
    /*
      Sort a specific row in descending order. Uses bubble sort.
      Invoke bubble sort with argument data[row].
    */
    public static void sortedRow(int[][] data, int row){
		bubbleSort(data[row]);
    }
    	    
    /* Find sum of each row of the 2D array, returns an aray of sums
     Example
     data[][] = 1 3 5      sums[] = 9 12 19
                2 4 6
                3 7 9
    */
    public static int[] rowSum(int[][] data){
		int sums[];
		sums = new int[3];
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				sums[y] = sums[y] + data[y][x];
			}			
		}
		return sums;
    }
    
    /* Create a duplicate of the 2D array using System.arraycopy method.
       returns the duplicate of the original 2D array.
     
     data = 1 3 5    duplicate = 1 3 5
            2 4 6                2 4 6
            8 9 7                8 9 7
    */
    public static int[][] matrixCopy(int[][] data){
		int matrixCopy[][];
		matrixCopy = new int[3][3];
		for (int y = 0; y <= data.length - 1; y++)
		{
			for (int x = 0; x <= data[0].length - 1; x++)
			{
				matrixCopy[y][x] = data[y][x];
			}			
		}
		return matrixCopy;
    }
    
    /*
        Copy and paste your bubble sort method you wrote in Lab 7
     */
	public static void bubbleSort(int[] array){
		int temp;
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
    
    /*
     Copy and paste your outputArray method you wrote in Lab 7
     */
	public static void outputArray(int[] array){
		int i = 0;
		for (int element : array) { //for each loop!!!
			if (i == array.length - 1) // avoid comma after the last element
			{
				System.out.print(element);
			} else {
				System.out.print(element + ", ");
			}
			i++;
		}
	}
	
	
}	
