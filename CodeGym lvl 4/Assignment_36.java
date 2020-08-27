package codeGym_lvl_4;

public class Assignment_36 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		while ( a <= 10) {
			while( b <= 10) {
				System.out.print(a * b + " ");
				b++;
			}
			b = 1;
			System.out.println(" ");
			a++;
		}
	}

}
