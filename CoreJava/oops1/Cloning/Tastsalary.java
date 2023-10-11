package Cloning;

public class Tastsalary {
	public static void main(String[] args) throws CloneNotSupportedException {
  company c = new company("Hariom",50000);
  company c1 = (company) c.clone();
		  c1.manager = "Lokesh";
		  c1.sl.money = 70000;
		  System.out.println(c.manager);
		  System.out.println(c.sl.money);
		  
		  System.out.println(c1.manager);
		  System.out.println(c1.sl.money);
}
}