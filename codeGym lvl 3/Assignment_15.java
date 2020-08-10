package codeGym_lvl_3;

/*    		Create 7 objects to display the 7 colors of the rainbow on the screen.
			Example output:
			Red
			Orange
			Yellow
			Green
			Blue
			Indigo
			Violet
			Each object displays a specific color when it is created.
*/

public class Assignment_15 {

	public static void main(String[] args) {
		
		Red red = new Red();
		Orange orange = new Orange();
		Yellow yellow = new Yellow();
		Green green = new Green();
		Blue blue = new Blue();
		Indigo indigo = new Indigo();
		Violet violet = new Violet();
		


	}
	
	public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
