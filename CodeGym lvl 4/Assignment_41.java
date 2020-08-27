package codeGym_lvl_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*¸		Enter a name from the keyboard and use a for loop to display the following 10 times: <name> loves me.

		Example output for the name "Scarlett":
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
		Scarlett loves me.
*/
public class Assignment_41 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine();
		
		for( int i = 1; i <= 10; i ++) {
			System.out.println(name + " loves me.");
		}

	}

}
