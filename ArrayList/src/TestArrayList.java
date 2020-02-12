import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    // Create a list to store cities
    ArrayList<String> cityList = new ArrayList<>();

    // Add some cities in the list
    cityList.add("London");
    // cityList now contains [London]
    cityList.add("Denver");
    // cityList now contains [London, Denver]
    cityList.add("Paris");
    // cityList now contains [London, Denver, Paris]
    cityList.add("Miami");
    // cityList now contains [London, Denver, Paris, Miami]
    cityList.add("Seoul");
    // contains [London, Denver, Paris, Miami, Seoul]
    cityList.add("Tokyo");
    // contains [London, Denver, Paris, Miami, Seoul, Tokyo]

    System.out.println("List size? " + cityList.size()); 
    System.out.println("Is Miami in the list? " +
      cityList.contains("Miami")); 
    System.out.println("The location of Denver in the list? "
      + cityList.indexOf("Denver")); 
    System.out.println("Is the list empty? " +
      cityList.isEmpty()); // Print false

    // Insert a new city at index 2
    cityList.add(2, "Xian");
    // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

    // Remove a city from the list
    cityList.remove("Miami");
    // contains [London, Denver, Xian, Paris, Seoul, Tokyo]

    // Remove a city at index 1
    cityList.remove(1);
    // contains [London, Xian, Paris, Seoul, Tokyo]

    // Display the contents in the list
    System.out.println(cityList.toString());

    // Display the contents in the list in reverse order
    for (int i = cityList.size() - 1; i >= 0; i--)
      System.out.print(cityList.get(i) + " ");
    System.out.println();
    
	
	System.out.println("Testing creation of a new ArrayList with int, float, char, string, boolean.");
	ArrayList test = new ArrayList();

	test.add(0, 1);
	test.add(1, 9.9);
	test.add(2, 'a');
	test.add(3, "test");
	test.add(4, true);
	test.add(5, 129203);
	test.add(6, 'a');
	test.add(7, 1.2345);
	test.add(8, false);
	test.add(9, "abcdefg test");
	
	System.out.println(test.toString());
	
	System.out.println("Testing remove of element [1] from new test ArrayList.");
	test.remove(1);
	
	System.out.println(test.toString());
	
  }
}