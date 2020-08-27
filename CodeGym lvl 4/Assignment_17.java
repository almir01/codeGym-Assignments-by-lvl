package codeGym_lvl_4;
import java.util.Scanner;
/*		Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
			Determine whether a triangle with these sides can exist.
			Display the result as follows:
			"The triangle is possible." - if a triangle with these sides could exist.
			"The triangle is not possible." - if a triangle with these sides cannot exist.
			
			Hint:
			A triangle can exist only if the sum of two of its sides is greater than the third side.
			You need to compare each side with the sum of the other two.
			If even one side is larger or equal to the sum of the other two sides, then no such triangle exists.
*/

public class Assignment_17 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		int a = number.nextInt();
		int b = number.nextInt();
		int c = number.nextInt();
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("The triangle is not possible.");
		}else {
			System.out.println("The triangle is possible.");
		}
	
	
	}

}
