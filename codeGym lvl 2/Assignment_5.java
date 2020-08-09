package codeGym_lvl_2;

public class Assignment_5 {
	
	/*
	  In the public static void hackSalary(int a) method, increase the salary by 1000 and display the following: "Your salary is: <a+1000> dollars per month."
	 
		where <a+1000> is the salary increased by 1000.
		
		Example output for a = 8000:
		Your salary is: 9000 dollars per month.
		
	*/

	public static void main(String[] args) {
		
		 hackSalary(7000);

	}
	
	public static void hackSalary(int a) {
        
		System.out.println("Your salary is : " +  (a + 1000) + " dollars per month.");
		
    }

}
