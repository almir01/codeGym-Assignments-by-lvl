package codeGym_lvl_4;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Assignment_22 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 Integer[] arr = new Integer[3];
		 
		 arr[0] = input.nextInt();
		 arr[1] = input.nextInt();
		 arr[2] = input.nextInt();
		 
		 Arrays.sort(arr, Collections.reverseOrder());
		 
		 System.out.println(Arrays.toString(arr));
		 
	}

}
