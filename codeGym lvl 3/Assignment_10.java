package codeGym_lvl_3;
/*
	     Amigo, today our task is to fill the ship's pool. Calculate how many liters of water are needed to fill the pool all the way up. 
	     The pool is known to have linear dimensions a x b x c, given in meters.
		These dimensions are passed to the getVolume method. The method should return the number of liters of water needed to fill the pool.
		
		Consider this example:
		The getVolume method is called with the arguments 25, 5, and 2.
		
		Example output:
		250000

*/
public class Assignment_10 {

	public static void main(String[] args) {
		
		 System.out.println(getVolume(25, 5, 2));

	}
	public static long getVolume(int a, int b, int c) {
        
		return a *b *c * 1000;
    }
}
