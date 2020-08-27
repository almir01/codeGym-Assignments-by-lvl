package codeGym_lvl_4;
import java.util.Scanner;
/*		Use the keyboard to enter three integers. Determine whether there is at least one pair of equal numbers among them.
		If such a pair exists, display the numbers separated by a space.
		If all three numbers are equal, then display all three.
		Here are some examples:
		a) if you enter the numbers
		1
		2
		2
		then we display
		2 2
		
		b) if you enter the numbers
		2
		2
		2
		then we display
		2 2 2
*/

public class Assignment_19 {

	public static void main(String[] args) throws Exception {
		
	Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if( a == b && a == c && c == b) {
			System.out.println(a + " " + b + " " + c);
		}else if(a == b) {
			System.out.println(a + " " + b);
		}else if(a == c) {
			System.out.println(a + " " + c);
		}else if(b == c) {
			System.out.println(b + " " + c);
		}
	}

}
