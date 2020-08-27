package codeGym_lvl_4;
import java.util.Scanner;

/*		Use the keyboard to enter a name.
		Use the keyboard to enter a birth date (three numbers): yyyy, mm, dd.
		
		Display the following:
		"My name is *name*.
		I was born on mm/dd/yyyy"
		
		Example output:
		My name is Kevin.
		I was born on 2/15/1988
*/
public class Assignment_45 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			String name = input.nextLine();
			int year = input.nextInt();
			int month = input.nextInt();
			int day = input.nextInt();
			
			System.out.println("My name is " + name);
			System.out.println("I was born " + month  + "/" + day+"/" + year );
			

	}

}
