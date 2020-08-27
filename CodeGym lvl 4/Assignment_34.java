package codeGym_lvl_4;
import java.util.Scanner;

/*		
		Use the keyboard to enter a string and a number N greater than 0.
		Use a while loop to display the string N times. Each value should be on a new line.
		
		Example input:
		abc
		2
		
		Example output:
		abc
		abc
 */

public class Assignment_34 {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		String n = input.nextLine();
		int num = input.nextInt();
		//int sum = 1;
		while(num > 0) {
			System.out.println(n);
			num--;
		}

	}

}
