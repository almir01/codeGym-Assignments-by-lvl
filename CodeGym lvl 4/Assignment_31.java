package codeGym_lvl_4;
import java.util.Scanner;
/* 			Use the keyboard to enter three integers. 
 * 			Display the number of positive numbers and the number of negative numbers in the original set,
 * 			 in the following form:
			"Number of negative numbers: a" and "Number of positive numbers: b", where a and b are the unknowns.
			
			Here are some examples:
			a) if you enter the numbers
			2
			5
			6
			then we display
			Number of negative numbers: 0
			Number of positive numbers: 3
			
			b) if you enter the numbers
			-2
			-5
			6
			then we display
			Number of negative numbers: 2
			Number of positive numbers: 1
*/
public class Assignment_31 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int counter = 0;
		
		while (counter <= 2) {
			int a = input.nextInt();
			
			if( a > 0) {
				positive++;
			}else {
				negative++;
			}
			counter++;
		}
		System.out.println("Number of negative numbers: " + negative);
		System.out.println("Number of positive numbers: " + positive);
	}
}






