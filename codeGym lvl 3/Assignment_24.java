package codeGym_lvl_3;

/*		Write the code for sumDigitsInNumber(int number). The method takes a three-digit whole number. 
 * 		You need to calculate the sum of the digits of this number, and then return the result.


		Consider this example:
		The sumDigitsInNumber method is called with the argument 546.
		Example output:
		15
*/
public class Assignment_24 {

	public static void main(String[] args) {

		System.out.println(sumDigitsInNumber(546));

	}

	public static int sumDigitsInNumber(int number) {

		int reminder = 0;
		int sum = 0;

		while (number > 0) {

			reminder = number % 10;
			sum += reminder;
			number = number / 10;

		}

		return sum;
	}
}
