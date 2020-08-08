package codeGym_lvl_0;

public class Assignment_7 {
	
	// Exercise 7
	//Uncomment one line so that the program displays the numbers 12 and 2 (first 12, and then 2).
	
	public static void main(String[] args) {
		
		int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;   //  <-- This needed to be uncommented

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

	}

}

