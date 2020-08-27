package codeGym_lvl_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*		The pedestrian traffic light is programmed as follows:
		at the beginning of each hour, the green signal is on for three minutes,
		then the signal is yellow for one minute,
		and then it is red for one minute.
		Then the light is green again for three minutes, etc.
		Use the keyboard to enter a real number t that represents the number of minutes that have elapsed since the beginning of the hour.
		Determine what color the traffic light is at the specified time.
		Display the result as follows:
		"green" if the light is green,
		"yellow" if the light is yellow, and
		"red" if the light is red.
		
		Example for 2.5:
		green
		Example for 3:
		yellow
		Example for 4:
		red
		Example for 5:
		green
*/
public class Assignment_18 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String num = reader.readLine();
		double t = Double.parseDouble(num);

		if (t % 5 >= 0 && t % 5 < 3) {
			System.out.println("green");

		} else if (t % 5 >= 3 && t % 5 < 4) {
			System.out.println("yellow");

		} else if (t % 5 >= 4 && t % 5 < 5) {
			System.out.println("red");

		} else {
			System.out.println("green");
		}

	}

}
