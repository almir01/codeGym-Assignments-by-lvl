package codeGym_lvl_4;
	
/*		Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.

			Example of screen output:
			8
			88
			888
			8888
			88888
			888888
			8888888
			88888888
			888888888
			8888888888
*/

public class Assignment_39 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(8);
			}
			System.out.println();
		}

	}

}
