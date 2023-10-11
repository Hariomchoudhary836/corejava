package Cloning;

public class cust1 implements Cloneable {
  String name = null;
  
  Acc1 a = new Acc1();
  
  public cust1(String name, int balance) {
	  this.name=name;
	  this.a.balance = balance;
  }
  @Override
	protected Object clone() throws CloneNotSupportedException {
		cust1 c = (cust1) super.clone();
		c.a = (Acc1) a.clone();
		return c;
	}
}
