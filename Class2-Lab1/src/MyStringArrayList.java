/**
 * Date Written:
 * Purpose: Simulates an ArrayList for Strings. MyStringArrrayList
 * is an abstract data type (ADT).
 *
 * @author Suranga Hettiarachchi
 */
public class MyStringArrayList {
    
    private String[] array; //container of this array list
    private static final int CAPACITY = 10; // initial capacity of the array
    private int size; // number of elements in the array
    
    /**
     * This default constructor sets the container capacity to be 10 and size to
     * 0, where container is empty.
     */
    public MyStringArrayList() {
        array = new String[CAPACITY];
        size = 0;
        
    }//comstructor
    
    /**
     *
     * @param e - element to be added
     * requires: e != null
     * ensures : e added to the end of this array list.
     * Add a new element at the end of this list
     */
    public void addLast(String e) {
        if (isFull()) { // increase capacity if array is full
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }//for
            array = temparray; // make temparray the container
        }//if
        array[size] = e; //add element e to last empty location.
        size++; // increment the size of this array list
    }//addLast
    
    /* This method is only used by this class.
     * returns true if this array list is full, otherwise returns false.
     */
    private boolean isFull() {
        return size == array.length;
    }//Full
    
    /**
     * requires: none
     * ensures: self.size == #self.size
     * @return current size of this array list
     * returns the current size (# of elements) of this list
     */
    public int getSize() {
        return size;
    }//Size
    
	public void addFront(String e){
		//Check to see if array is full
		if (isFull()) { // increase capacity if array is full
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }//for
            array = temparray; // make temparray the container
        }//if
		
		for(int i = size; i > 0; i--) {
			array[i] = array[i-1];
			System.out.println("Shifting: " + array[i]);
		}
		array[0] = e;
		size = size + 1;
	}
	
	public boolean contains(String e) {
		boolean isTrue = false;
		for (int i = 0; i < size; i++) {
			if(array[i].equals(e)) {
				isTrue = true;
				break;
			}
			else {
				isTrue = false;
			}
		}
		return isTrue;
	}
	
	public String getElement(int i) {
		String getelementstring;
		if ((i >= 0) && (i < size)) {
				getelementstring = array[i];
			}
		else {
			getelementstring = "NoPosition";
		}
		return getelementstring;
	}
	
	public String removeElementAt(int a) {
		String temp = "not an index";
		if ((a>=0)&&(a<size)){
			temp = array[a];
			
			//now move everybody
			for (int i = a; i <size-1; i++) {
				array[i] = array[i+1];
			}
			
			size --;
		}
		return temp;
	}
	
	public String toString() {
		String tempstring = " ";
		for (int i = 0; i < size; i++) {
			tempstring = tempstring + " " + array[i];
		}
		return tempstring;
	}
}