package codeGym_lvl_4;

import java.util.*;
import java.util.Arrays;

public class Assignment_21 {

	public static void main(String[] args) {
		
		/* Solution with arrays 
		 * 
		 * Scanner reader = new Scanner(System.in);
		 * 
		 * 
		 * int a = reader.nextInt(); int b = reader.nextInt(); int c = reader.nextInt();
		 * int d = reader.nextInt();
		 * 
		 * int[] arr = {a, b, c, d};
		 * 
		 * Arrays.sort(arr);
		 * 
		 * System.out.println(arr[3]);
		 */

		// Solution with whil loops
		
		Scanner input = new Scanner(System.in);
	
		int largest = 0;
		int count  = 0;
		
		while (count <= 3) {
			
			int b = input.nextInt();
			
			if(b >= largest) {
				largest = b;
			}
			count++;
		}
		System.out.println(largest);
	}

}
