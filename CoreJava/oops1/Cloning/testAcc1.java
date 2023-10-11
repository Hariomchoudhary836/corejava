package Cloning;

public class testAcc1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
     cust1 c1 = new cust1("mohit", 201);
	cust1 c2 = (cust1) c1.clone();
	c2.name = "Hariom";
	c2.a.balance= 200;
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
     
}
}
