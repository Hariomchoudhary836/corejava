package Collection;

public class Emp_hashcosdetest {
	public static void main(String[] args) {
	Emp_hashcode E1 = new Emp_hashcode(1, "Hariom", "Indore");
	Emp_hashcode E2 = new Emp_hashcode(1, "Hariom", "Indore");
	
	System.out.println(E1.equals(E2));
	System.out.println(E1.hashCode());
	System.out.println(E2.hashCode());
	}
}