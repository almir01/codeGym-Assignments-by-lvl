package codeGym_lvl_3;

	/*   Write the code for the addTenPercent method, which increases the passed integer by 10%.
		Use the return statement to return the result from the addTenPercent method.
		
		Consider this example:
		return 123 * 435;
*/


public class Assignment_4 {

	public static void main(String[] args) {
		
		System.out.println(addTenPercent(9));

	}
	
	public static double addTenPercent(int i) {
        
		return i + (i * 0.10);
    }
}
