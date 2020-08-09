package codeGym_lvl_2;

public class Assignment_4 {
	
	/*
	    In the main method, create a Man object and save a reference to it in the variable man.
		Also, create a Woman object and save a reference to it in the variable woman.
		
		Hint: Use the following construct to create a Woman object and assign a reference to that object to the variable woman:
		VariableType variableName = new TypeOfObjectBeingCreated();
		Save a reference to the previously created Woman object in man.wife.
		Save a reference to the previously created Man object in woman.husband (Hint: woman.husband = man).	 
	*/

	public static void main(String[] args) {
		
		Man man = new Man();
		Woman woman = new Woman();
		
		woman.husband = man;
		man.wife = woman;

	}
	
		public static class Man {
	        public int age;
	        public int height;
	        public Woman wife;
	    }
	
	    public static class Woman {
	        public int age;
	        public int height;
	        public Man husband;
	    }

}
