package codeGym_lvl_4;
import java.io.*;

/*		Use the keyboard to enter an integer. Display a string description as follows:
		"Negative even number" - if the number is negative and even,
		"Negative odd number" - if the number is negative and odd,
		"Zero" - if the number is 0,
		"Positive even number" - if the number is positive and even,
		"Positive odd number" - if the number is positive and odd.
		
		Example for 100:
		Positive even number
		
		Example for -51:
		Negative odd number
*/

public class Assignment_28 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String num1 = reader.readLine();
		int num = Integer.parseInt(num1);
		
		if(num < 0 && num % 2 == 0) {
			System.out.println("Negative even number");
		}else if(num < 0 && num % 2 != 0) {
			System.out.println("Negative odd number");
		}else if(num == 0) {
			System.out.println("Zero");
		}else if(num > 0 && num % 2 == 0) {
			System.out.println("Positive even number");
		}else if(num > 0 && num % 2 != 0) {
			System.out.println("Positive odd number");
		}
	}

}
