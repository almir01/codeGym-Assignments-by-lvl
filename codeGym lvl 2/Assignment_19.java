package codeGym_lvl_2;

/*  Implement the print3 method. The method should display the passed string (word) three times, but on the same line.
	Words must be separated by a space and should not merge into one
*/

public class Assignment_19 {

	public static void main(String[] args) {
		print3("window");
		print3("file");
	}

	public static void print3(String s) {
		for (int i = 0; i <= 2; i++) {
			System.out.print(s + " ");

			if (i == 2) {
				System.out.println();
			}
		}

	}
}
