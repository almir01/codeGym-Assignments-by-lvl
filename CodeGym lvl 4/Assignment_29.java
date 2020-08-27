package codeGym_lvl_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*		Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
		"even single-digit number" - if the number is even and has one digit,
		"odd single-digit number" - if the number is odd and has one digit,
		"even two-digit number" - if the number is even and has two digits,
		"odd two-digit number" - if the number is odd and has two digits,
		"even three-digit number" - if the number is even and has three digits,
		"odd three-digit number" - if the number is odd and has three digits.
		If the entered number does not fall in the range 1 - 999, don't display anything.
		
		Example for 100:
		even three-digit number
		
		Example for 51:
		odd two-digit numbe
*/

public class Assignment_29 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String number = reader.readLine();
		int num = Integer.parseInt(number);

		if (num > 0 && num < 10 && num % 2 == 0) {
			System.out.println("even single-digit number");

		} else if (num > 0 && num <= 9 && num % 2 != 0) {
			System.out.println("odd single-digit number");

		} else if (num >= 10 && num <= 99 && num % 2 == 0) {
			System.out.println("even two-digit number");

		} else if (num >= 10 && num <= 99 && num % 2 != 0) {
			System.out.println("odd two-digit number");

		} else if (num >= 10 && num <= 999 && num % 2 == 0) {
			System.out.println("even three-digit number");

		} else if (num >= 10 && num <= 999 && num % 2 != 0) {
			System.out.println("odd three-digit number");
		}

	}

}
