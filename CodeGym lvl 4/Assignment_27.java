package codeGym_lvl_4;

import java.util.Scanner;

/*		Use the keyboard to enter two integers representing the coordinates of a point not on the coordinate axes.
		Display the number of the quadrant that contains the given point.
		
		Hint:
		Point (a,b) belongs to a quadrant if the following conditions are true:
		for the first quadrant: a>0 and b>0;
		for the second quadrant: a<0 and b>0;
		for the third quadrant: a<0 and b<0;
		for the fourth quadrant: a>0 and b<0.
		
		Example for 4 6:
		1
		
		Example for -6 -6:
		3
*/

public class Assignment_27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if( a > 0 && b > 0) {
			System.out.println(1);
		}else if(a < 0 && b > 0) {
			System.out.println(2);
		}else if(a < 0 && b < 0) {
			System.out.println(3);
		}else if(a > 0 && b < 0) {
			System.out.println(4);
		}
	}

}
