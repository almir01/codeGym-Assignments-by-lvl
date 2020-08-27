package codeGym_lvl_4;

import java.io.*;

/*		Use the keyboard to enter the name and age. 
 * 		If the age is less than 18, display "Grow up a little more".
 */

public class Assignment_24 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine();
		String age1 = reader.readLine();
		int age = Integer.parseInt(age1);
		
		if( age < 18) {
			System.out.println("Grow up a little more");
		}

	}

}
