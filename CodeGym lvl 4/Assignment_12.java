package codeGym_lvl_4;

/*	 Write the checkInterval method. 
	 * The method should check whether an integer is in the range from 50 to 100 and
	 *  display the result on the screen as follows:
	 *  "The number a is not in the interval." or "The number a is in the interval.", where a is the method argument.
	
	Example for 112:
	The number 112 is not in the interval.
	
	Example for 60:
	The number 60 is in the interval.
*/
public class Assignment_12 {

	public static void main(String[] args) {

		checkInterval(60);
		checkInterval(112);
		checkInterval(10);

	}

	public static void checkInterval(int a) {
		
		if(a >= 50 && a <= 100) {
			System.out.println("The number " + a + " is in the interval.\"");
		}else {
			System.out.println( "The number " + a + " is not in the interval.");
		}
	}

}
