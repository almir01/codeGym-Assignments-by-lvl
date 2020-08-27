package codeGym_lvl_4;

/*		Write the displayClosestToTen method. 
 * 		The method should display the argument that is nearest to 10.
		 
		For example, given the numbers 8 and 11, 11 is closest to ten. 
		If both numbers are equally close to 10, then display either of them.
		
		Hint:
		use the public static int abs(int a) method, which returns the absolute value of a number.
*/
public class Assignment_10 {

	public static void main(String[] args) {
		
		 displayClosestToTen(8, 11);
	     displayClosestToTen(7, 14);
	}
	
	 public static void displayClosestToTen(int a, int b) {
	       int a1 = abs(a-10);
	       int b1 = abs(b - 10);
	       
	       if(a1 > b1) {
	    	   System.out.println(b);
	       }else if(a1 < b1) {
	    	   System.out.println(a);
	       }else {
	    	   System.out.println(a);
	       }

	    }
	 public static int abs(int a) {
	        if (a < 0) {
	            return -a;
	        } else {
	            return a;
	        }
	    }
}
