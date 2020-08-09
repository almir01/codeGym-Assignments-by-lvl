package codeGym_lvl_2;

public class Assignment_3 {
	
	/*
	    The convertCelsiusToFahrenheit(int celsius) method accepts a value in degrees Celsius. 
	    The method should convert the temperature and return the value in degrees Fahrenheit.
	    The Celsius temperature (TC) and the Fahrenheit temperature (TF) are related by the following                         relationship:
		TF = (9 / 5) * TC + 32.

		Consider this example:
		A value of 41 is passed to the convertCelsiusToFahrenheit
	  
	       Example output:
               105.8
	 */

	public static void main(String[] args) {
		
		System.out.println(convertCelsiusToFahrenheit(41));
	}
	
	public static double convertCelsiusToFahrenheit(int celsius) {
       
		 return (9 / 5.0) * celsius + 32;
		
		
		
    }

}
