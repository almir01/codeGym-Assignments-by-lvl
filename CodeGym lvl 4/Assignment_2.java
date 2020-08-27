package codeGym_lvl_4;

/*		Calculate the total cost of apples.
		The total cost of apples corresponds to public static int applePrice.
*/

public class Assignment_2 {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		apple.addPrice(50);
		
		Apple apple2 = new Apple();
		apple.addPrice(100);
		System.out.println("The cost of apples is " + Apple.applePrice);

	}
	
		public static class Apple {
			
	    public static int applePrice = 0;
	    
	    
	    public static void addPrice(int applePrice) {
	            
	    	Apple.applePrice += applePrice;
	    	
	        }
	    }

}
