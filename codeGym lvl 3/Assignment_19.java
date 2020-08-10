package codeGym_lvl_3;

import java.io.*;

/*     Use the keyboard to separately enter the name, number1, and number2.
		Display the following phrase:
		<name> will receive <number1> in <number2> years.
		
		Here's an example:
		Nick will receive 10000 in 5 years.
*/

public class Assignment_19 {

	public static void main(String[] args) throws Exception  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();
        String num1 = reader.readLine();
        int value = Integer.parseInt(num1);
        String num3 = reader.readLine();
        int age = Integer.parseInt(num3);
        
        System.out.println(name + " will receive " + value + " in " + age + " years.");
        
	}

}
