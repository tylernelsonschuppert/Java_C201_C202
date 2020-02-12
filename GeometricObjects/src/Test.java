// This code is incomplete, therefore it throws a java.lang.NullPointerException
public class Test {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2.1);
        System.out.println("Area of Circle c2 is " + c2.getArea());
        System.out.println("Perimeter of Circle c2 is " + c2.getPerimeter());
        if (c1.compareTo(c2) == 0) {
            System.out.println("Circle c1 and c2 have equal coverage of area");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("Circle c1 has larger area than the circle c2");
        } else {
            System.out.println("Circle c1 has smaller area than the circle c2");
        }
        Circle c3 = c2.clone();
        if (c2.compareTo(c3) == 0) {
            System.out.println("Circle c2 and c3 have equal coverage of area");
        } else if (c2.compareTo(c3) > 0) {
            System.out.println("Circle c2 has larger area than the circle c3");
        } else {
            System.out.println("Circle c2 has smaller area than the circle c3");
        }

        System.out.println("Circle c3 -->" + c3);


        // construct an Octagon
        // clone an Octagon
        // Write code to output area and perimeter, and compare Octagon objects o1 and o2.


        // Construct a EquilateralTriangle 
        // clone an EquilateralTriangle
        // Write code to output area and perimeter, and compare EquilateralTriangle objects t1 and t2. 	    
		
		
		// construct an Ellipse
        // clone an Ellipse
        // Write code to output area, perimeter, and eccentricity, and compare Ellipse objects e1 and e2.


        GeometricObject[] geo = new GeometricObject[10];
        for (int i = 0; i < geo.length; i++) {
            if (Math.random() < 0.5) {
                geo[i] = new Circle(Math.random());
            }
            // extend the code to add Octagons, Ellipse, and EquilateralTriangle to array.
            // Each object should have an equal chance of getting inserted into the array
        }

        for (int i = 0; i < geo.length; i++) {
            System.out.println("Object being processed belongs to class " + geo[i].getClass());
            if (geo[i] instanceof Circle) {
                System.out.println("Confirming Object as a Circle");
            }
            // extend the code to check if an object in the array is an Octagons, Ellipse, or EquilateralTriangle. 
            // Output appropriate messages .
        }

        for (int i = 0; i < geo.length; i++) {
            System.out.println("Object at position" + i + " is " + geo[i].getClass() + " it contains -->" + geo[i]);
        }

    }
}
