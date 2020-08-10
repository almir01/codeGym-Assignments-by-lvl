package codeGym_lvl_3;
	/*
	  
	  Implement the public static void writeToConsole(String s) method, 
	  which adds "printing: " to the beginning of the string and displays the altered string.

		Example output for "Hello, World! ":
		printing: Hello, World!
	 */
public class Assignment_11 {

	public static void main(String[] args) {
		
		writeToConsole("Hello, World!");

	}
	
	 public static void writeToConsole(String s) {
	        
		 	System.out.println("printing: " + s);
		 
	    }
}
