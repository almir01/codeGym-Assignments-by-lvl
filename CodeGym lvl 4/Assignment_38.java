package codeGym_lvl_4;
import java.util.Scanner;
/*		Use the keyboard to enter two numbers m and n.
		Using a for loop, display an n x m rectangle made of eights.
		
		Here's an example: m=2, n=4
		8888
		8888
*/

public class Assignment_38 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		for( int i = 1; i <= rows; i++) {
			for(int j = 1; j <= columns; j++) {
				System.out.print("8");
			}
			System.out.println("");
		}
	}

}
