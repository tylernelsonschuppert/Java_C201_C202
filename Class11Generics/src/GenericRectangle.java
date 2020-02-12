/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
public class GenericRectangle <T extends Number> {
	T height;
	T width;
	
	
	//constructors
	public GenericRectangle(T height, T width) {
		this.height = height;
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public T getWidth() {
		return width;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "GenericRectangle{" + "height=" + height + ", width=" + width + '}' + "\n Area is: " + getArea();
	}
	
	public Number getArea() {
		return height.doubleValue()*width.doubleValue();
	}	
	
	public static void main(String[] args) {
		GenericRectangle<Double> a = new GenericRectangle<>(2.3, 1.2);
		System.out.println(a);
		GenericRectangle<Integer> b = new GenericRectangle<>(9, 8);
		System.out.println(b);
	}
}