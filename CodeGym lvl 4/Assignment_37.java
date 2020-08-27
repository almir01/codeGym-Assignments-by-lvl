package codeGym_lvl_4;

/*		Use a for loop to display even numbers from 1 to 100 inclusive.
		Display each value on a new line
*/

public class Assignment_37 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
