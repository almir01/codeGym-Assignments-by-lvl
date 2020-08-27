package codeGym_lvl_4;
import java.util.Scanner;
/*
  			Use the keyboard to enter three integers. Display the number of positive numbers in the original set.

			Here are some examples:
			a) if you enter the numbers
			-4
			6
			6
			then we display
			2
 */


public class Assignment_30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int counter = 0;
		int sum = 0;
		
		while(counter <= 2) {
			
			int a = input.nextInt();
			
			if( a > 0 ) {
				sum++;
			}
			counter++;
		}
		
		System.out.println(sum);
		
	}

}
