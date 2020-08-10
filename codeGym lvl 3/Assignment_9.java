package codeGym_lvl_3;
/*     
       Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
		1
		1+2=3
		1+2+3=6
...
*/

public class Assignment_9 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			sum +=i;
			
			System.out.println(sum);
		}
		
	}

}
