package codeGym_lvl_3;
/*
  
		Write code for the convertEurToUsd method, which converts euros to dollars at a given exchange rate.
		Use a return statement to return the result from the convertEurToUsd method. Example: return 123*435;
		Call the convertEurToUsd method twice in the main method with any arguments.
		Display the results, each time on a new line.
		
		Hint:
		The result is calculated using the following formula: US dollars = euros * exchange rate

*/

public class Assignment_3 {

	public static void main(String[] args) {
		
		System.out.println(convertEurToUsd(100, 1.18));
		System.out.println(convertEurToUsd(200, 1.18));

	}
	
	 public static double convertEurToUsd(int eur, double exchangeRate) {
	        
		 return eur * exchangeRate;
	 }
	
}