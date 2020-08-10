package codeGym_lvl_3;

import java.io.*;

/*		Use the keyboard to enter three names, then display:
		name1 + name2 + name3 = Pure love. Ooo la-la!
		
		For example:
		Kevin + Eva + Angelica = Pure love. Ooo la-la!
*/

public class Assignment_23 {

	public static void main(String[] args) throws Exception  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		String name1 = reader.readLine();
		String name2 = reader.readLine();
		
		System.out.println(name + " + " + name1 + " + " + name2 + " = " + "Pure love. Ooo la-la!");
	}

}