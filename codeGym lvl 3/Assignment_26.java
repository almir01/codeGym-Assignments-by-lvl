package codeGym_lvl_3;
import java.io.*;

	/*      Use the keyboard to enter the number n.
			Display the phrase "I will earn $n per hour" on the screen.
			
			For example:
			I will earn $100 per hour
	*/
public class Assignment_26 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String n = reader.readLine();
		
		System.out.println("I will earn $" + n + " per hour");

	}

}
