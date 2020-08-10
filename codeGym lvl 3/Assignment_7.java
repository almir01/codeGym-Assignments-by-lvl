package codeGym_lvl_3;
/*
       Create 5 Zerg units, 3 Protoss units and 4 Terran units.
       Give them all unique names.
 */

public class Assignment_7 {

	public static void main(String[] args) {
		
		Zerg z1 = new Zerg();
		z1.name = "Zerg1";
		Zerg z2 = new Zerg();
		z2.name = "Zerg2";
		Zerg z3 = new Zerg();
		z3.name = "Zerg3";
		Zerg z4 = new Zerg();
		z4.name = "Zerg4";
		Zerg z5 = new Zerg();
		z5.name = "Zerg5";
		
		Protoss p1 = new Protoss();
		p1.name = "Protos1";
		Protoss p2 = new Protoss();
		p2.name = "Protos2";
		Protoss p3 = new Protoss();
		p3.name = "Protos3";
		
		Terran t1 = new Terran();
		t1.name = "Terran1";
		Terran t2 = new Terran();
		t2.name = "Terran2";
		Terran t3 = new Terran();
		t3.name = "Terran3";
		Terran t4 = new Terran();
		t4.name = "Terran4";
		
	}
	
		public static class Zerg {
	        public String name;
	    }

	    public static class Protoss {
	        public String name;
	    }

	    public static class Terran {
	        public String name;
	    }
}
