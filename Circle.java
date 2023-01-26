/**
 * The program will calculate the area of a circle
 * @author Ethan Hopkins
 * @version 1.0
 * Homework 1
 * Spring Semester/Freshman Year
 */

public class Circle {
	double radius;//radius will be used to determine the area of the circle.
	
	
	/**
	 * The default constructor will inititalize radius to a value of 1.
	 */
	public Circle() {
		radius = 1;
	}//end default constructor
	
	
	/**
	 * 
	 * @param radius; the value of radius will be 0 if any value is specified.
	 */
	public Circle(double radius) {
		radius = 0;
	}//end preferred constructor
	
	
	/**
	 * Use the formula for the area of a circle with the radius to find 
	 * the value of the area.
	 * 
	 * @return the area.
	 */
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}//end area method
	
	
	/**
	 * @return the value of radius.
	 */
	public double getRadius() {
		return radius;
	}//end getter
	
	
	/**
	 * 
	 * @param newRadius; the value of radius to be set.
	 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}//end setter
	
}//end class
