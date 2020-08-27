package codeGym_lvl_4;
import java.util.*;
/*	Use the keyboard to enter three integers. 
 * One of the numbers is unique. The other two are identical. 
 * Display the ordinal number of the number that is different from the others.


Example for 4 6 6:
1

Example for 6 6 3:
3

 */

public class Assignment_26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a == b && b == c) {
			System.out.println();
		}else if(a == b) {
			System.out.println(3);
		}else if(a == c) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}

	}

}
