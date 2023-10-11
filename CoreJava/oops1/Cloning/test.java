package Cloning;

public class test {
  public static void main(String[] args) throws CloneNotSupportedException {
	Customer1 c1 = new Customer1("hari", 12000);
	Customer1 c2 = (Customer1) c1.clone();
	c2.name = "om";
	c2.c.balance = 2000;
	
	System.out.println(c1.name);
	System.out.println(c1.c.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.c.balance);
}
}
