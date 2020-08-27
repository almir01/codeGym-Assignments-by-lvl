package codeGym_lvl_4;
import java.util.Scanner;
import java.util.Arrays;

public class Assignmnet_43 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] d = {a, b, c};
		
		Arrays.sort(d);
		System.out.println(d[1]);
		
		

	}

}
