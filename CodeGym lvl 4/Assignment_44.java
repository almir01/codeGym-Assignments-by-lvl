package codeGym_lvl_4;
import java.util.Scanner;

/*		Use the keyboard to enter numbers.
		If the user enters -1, display the sum of all entered numbers and end the program.
		-1 should be included in the sum.
*/

public class Assignment_44 {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

		int sum = 0;

		while (true) {

			int num = number.nextInt();

			sum += num;
			if (num == -1) {
				break;
			}

		}
		System.out.println(sum);
	}

}
