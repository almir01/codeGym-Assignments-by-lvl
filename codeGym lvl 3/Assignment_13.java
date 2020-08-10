package codeGym_lvl_3;
	
/*      Display all possible combinations of the words "Sam", "I", "Am".
		
		Hint: there are 6 combinations.
		Display each combination on a new line. Do not separate the words.
		
		Consider this example:
		IAmSam
		AmSamI
		...
*/
public class Assignment_13 {

	public static void main(String[] args) {
		
		String a = "I";
		String b = "Am";
		String c = "Sam";
		
		System.out.println(a + " " + b + " " + c);
		System.out.println(a + " " + c + " " + b);
		System.out.println(b + " " + a + " " + c);
		System.out.println(b + " " + c + " " + a);
		System.out.println(c + " " + a + " " + b);
		System.out.println(c + " " + b + " " + a);

	}

}
