package codeGym_lvl_3;
import java.io.*;

/*    			Enter the number and name from the keyboard. Display the following string:
				<name> will take over the world in <number> years. Mwa-ha-ha!
				
				Here's an example:
				Kevin will take over the world in 8 years. Mwa-ha-ha!
*/

public class Assignment_18 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        String name = reader.readLine();
        String yage = reader.readLine();
        int age = Integer.parseInt(yage);
        
        System.out.println(name + " will take over the world in " + age + " years. Mwa-ha-ha!");

	}

}
