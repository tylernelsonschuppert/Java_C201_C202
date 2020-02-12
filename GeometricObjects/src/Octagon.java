// Do the Following: 
// Octagon is a derived class of GeometricObject, it implements Comparable and Cloneable interfaces.
// implement compareTo, clone, equals, and toString methods.
// Add Javadoc as shown in Circle class and remove all comment lines added by Dr.H.

public class Octagon { 

    private double side;
    
    public Octagon() {
        this.side = 1.0;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() {
        return 8 * side;
    }
    
}
