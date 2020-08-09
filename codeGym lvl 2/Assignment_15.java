package codeGym_lvl_2;

/* 			"Amigo, did you know that lunar gravity is about 17% of gravity on Earth?"
			"Nope."
			"Neither did I. Now this information will be used a lot. 
			To avoid having to manually calculate it each time, 
			implement a getWeight(int) method that takes a person's body weight on Earth (in newtons), 
			and returns the weight of that person on the moon (in newtons).
			The method should return a double."
			
			Consider this example:
			The getWeight method is called with the argument 888.
			
			Example output:
			150.96
*/
public class Assignment_15 {

	public static void main(String[] args) {
		
		System.out.println(getWeight(888));

	}
	public static double getWeight(int earthWeight) {
		
	      double moonWeight = earthWeight * 17.0 / 100;
	      
	      return moonWeight;
	}

}
