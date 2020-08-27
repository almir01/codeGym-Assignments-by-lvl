package codeGym_lvl_4;
import java.io.*;
/*		 Use the keyboard to enter a number.
		If the number is positive, then double it.
		If the number is negative, add one.
		If the entered number is zero, display zero.
		Display the result on the screen.
*/

public class Assignment_14 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		
		String num = reader.readLine();
		int number = Integer.parseInt(num);
				
		if(number > 0 ) {
			System.out.println(number * 2);
		}else if(number < 0 ) {
			System.out.println( number +1);
		}else {
			System.out.println(number);
		}
	}

}
