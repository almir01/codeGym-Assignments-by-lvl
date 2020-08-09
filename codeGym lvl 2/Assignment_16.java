package codeGym_lvl_2;

/*  Write a function that computes the minimum of three numbers.
	
	Hint:
	You need to write the body of the existing min function
*/

public class Assignment_16 {

	public static void main(String[] args) throws Exception {
		System.out.println(min(1, 2, 3));
		System.out.println(min(-1, -2, -3));
		System.out.println(min(3, 5, 3));
		System.out.println(min(5, 5, 10));
	}
	
	public static int min(int a, int b, int c) {
       
		int m2;
		
		if(a <= b && a <= c) {
			m2 = a;
		}else if (b <= a && b <= c){
			m2 = b;
		}else {
			m2 = c;
		}
        
       return m2;
    }

}
