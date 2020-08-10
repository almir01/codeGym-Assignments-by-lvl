package codeGym_lvl_3;
	/*
		 * Implement the getFeetFromInches(int inches) method. The method takes the number of inches. 
		 * Your task is to make the method return the number of full feet represented by the variable inches. (1 feet = 12 in).
	
			Consider this example:
			The getFeetFromInches method is called with the argument 243.
			
			Example output:
			20
	 * 
	 */
public class Assignment_22 {

	public static void main(String[] args) {
		
		System.out.println(getFeetFromInches(28));
	}
	
	 public static int getFeetFromInches(int inches) {
	        
		 	int feet = inches / 12;
		 	
		 	return feet;
		 
	    }
}
