package codeGym_lvl_4;
import java.io.*;

/*		Use the keyboard to enter two integers, and display the minimum. 
 * 		If the two numbers are equal, display either of them.
 */

public class Assignment_20 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		
		String a = reader.readLine();
		String b = reader.readLine();
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		if(a1 ==  b1) {
			System.out.println(a1);
		}else if(a1 < b1) {
			System.out.println(a1);
		}else {
			System.out.println(b1);
		}
	}

}
