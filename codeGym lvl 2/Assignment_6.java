package codeGym_lvl_2;

public class Assignment_6 {
	
	/*
	  Display the circumference of a circle, which is calculated using the formula: C = 2 * pi * radius.
	  The result is a fractional number (double).
	  Use 3.14 as the value of pi.
	 
	  
	 */

	public static void main(String[] args) {
		
		printCircleCircumference(5);
		
	}
	
	public static void printCircleCircumference(int radius) {
		
		double pi = 3.14;
		
		double c = 2 * pi * radius;
		
		System.out.println(c);
        
    }

}
