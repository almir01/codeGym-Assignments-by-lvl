package codeGym_lvl_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*		Use the keyboard to enter a number representing a day of the week. 
 * 		Then, depending on the entered number, display the name of the day of the week: 
 * 		"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", 
 * 		if you enter a number greater than 7 or less than 1, display "No such day of the week".

		Example for number 5:
		Friday
		
		Example for number 10:
		No such day of the week
*/
public class Assignment_15 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		
		String number = reader.readLine();
		int dayOfWeek = Integer.parseInt(number);
		
		switch(dayOfWeek) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default: 
			System.out.println("No such day of the week");
		}

	}

}
