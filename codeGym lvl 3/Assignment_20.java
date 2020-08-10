package codeGym_lvl_3;
import java.io.*;
/*		Use the keyboard to enter a name and display the following:
		<name> makes $120,000 a year. Ha-ha-ha!
		
		For example:
		Sara makes $120,000 a year. Ha-ha-ha!
*/
public class Assignment_20 {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		
		System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");
		

	}

}
