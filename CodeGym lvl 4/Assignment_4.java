package codeGym_lvl_4;

//Help the cat get a name using the setName method.

public class Assignment_4 {

	private String name = "nameless cat";

	public void setName(String name) {

		this.name = name;
	}

	public static void main(String[] args) {

		Assignment_4 cat = new Assignment_4();
		cat.setName("Simba");
		System.out.println(cat.name);
	}

}