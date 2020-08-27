package codeGym_lvl_4;

/* 		Write code in the addNewCat method to increase the number of cats by 1 each time it is called.
		The variable catCount corresponds to the number of cats.
*/

public class Assignment_5 {
	
	private static int catCount = 0;
	
	 public static void addNewCat() {
	        Assignment_5.catCount++;
	    }
	
	public static void main(String[] args) {
		Assignment_5 cat = new Assignment_5();
		cat.addNewCat();
		
		Assignment_5 cat1 = new Assignment_5();
		cat.addNewCat();
		
		Assignment_5 cat2 = new Assignment_5();
		cat.addNewCat();
		
		Assignment_5 cat3 = new Assignment_5();
		cat.addNewCat();
		
		System.out.println(Assignment_5.catCount);
	}

}
