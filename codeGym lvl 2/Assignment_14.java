package codeGym_lvl_2;

/*      Write a function that returns the minimum of two numbers.
		
		Hint:
		You need to write the body of the existing min function.
*/
public class Assignment_14 {

	 public static int min(int a, int b) {
	        
		 int m2;
		 
		 if(a < b) {
			 m2 = a;
		 }else {
			 m2 = b;
		 }
		 return m2;
	    }
	
	public static void main(String[] args) {
		
		 System.out.println(min(12, 33));
	     System.out.println(min(-20, 0));
	     System.out.println(min(-10, -20));
	}

}
