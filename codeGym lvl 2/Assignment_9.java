package codeGym_lvl_2;

				/*Create 3 Dog objects.
				Store each instance in a separate variable.
				Give them the names "Max", "Bella", and "Jack".
				*/

public class Assignment_9 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Max";
		
		Dog dog2 = new Dog();
		dog2.name = "Bella";
		
		Dog dog3 = new Dog();
		dog3.name = "Jack";
		

	}
	
	public static class Dog {
        public String name;
    }

}
