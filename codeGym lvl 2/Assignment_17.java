package codeGym_lvl_2;

/*   Write a function that computes the minimum of four numbers.
	The function min(a, b, c, d) should use (call) the function min(a, b)
	
	Hint:
	You need to write the body of the two existing min functions
*/

public class Assignment_17 {

	 public static void main(String[] args) throws Exception {
	        System.out.println(min(-20, -10));
	        System.out.println(min(-20, -10, -30, -40));
	        System.out.println(min(-20, -10, -30, 40));
	        System.out.println(min(-40, -10, -30, 40));
	    }
	 
	    public static int min(int a, int b, int c, int d) {
	        
	    	int x = min(a , b);
	    	int y = min(c, d);
	    	int z = min(x, y);
	    	
	    	return z;
	    	

	    }

	    public static int min(int a, int b) {
	        int m2;
	        
	        if(a < b) {
	        	m2 = a;
	        }else {
	        	m2 = b;
	        }
	        return m2;
	    }

}
