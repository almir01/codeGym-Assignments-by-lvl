package codeGym_lvl_3;
	/*
	    Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
		Call it twice in the main method with any arguments.
		Display the results, each time on a new line.
	 */
public class Assignment_12 {

	public static void main(String[] args) {
		
		System.out.println(convertToSeconds(1));
		System.out.println(convertToSeconds(2));
		
	}
	
	public static int convertToSeconds(int hour) {
		
		return hour  * 60 * 60;
	}
}
