package codeGym_lvl_4;
import java.io.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*	Use the keyboard to enter the name and age. 
 * If the age is more than 20, display "18 is old enough".
 */

public class Assignment_25 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine();
		String age1 = reader.readLine();
		int age = Integer.parseInt(age1);
		
		if(age > 20) {
			System.out.println("18 is old enough");
		}

	}

}
