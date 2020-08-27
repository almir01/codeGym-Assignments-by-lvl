package codeGym_lvl_4;

import java.io.*;

/*    	Use the keyboard to enter two names. If the names are identical, display "The names are identical".
		If the names are different, but they are the same length, display "The names are the same length".
		If the names and name lengths are different, don't display anything.
*/

public class Assignment_23 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name1 = reader.readLine();
		String name2 = reader.readLine();

		if (name1.equals(name2)) {
			System.out.println("The names are identical");
		} else if (name1.length() == name2.length()) {
			System.out.println("The names are the same length");
		}

	}

}
