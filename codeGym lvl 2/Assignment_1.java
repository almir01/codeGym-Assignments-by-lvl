package codeGym_lvl_2;

/*
 In the print method, display the passed string 4 times. Each time, on a new line.
 */

public class Assignment_1 {

	
	public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
       
    	for(int i = 0; i <= 3; i++) {
    		System.out.println(s);
    	}
    }
}