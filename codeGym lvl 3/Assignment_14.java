package codeGym_lvl_3;

/*			Display a 10 x 10 multiplication table in the following form:
			1 2 3 4 …
			2 4 6 8 …
			3 6 9 12 …
			4 8 12 16 …
			…
*/

public class Assignment_14 {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

	}

}
