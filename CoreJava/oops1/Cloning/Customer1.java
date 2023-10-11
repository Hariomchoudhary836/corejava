package Cloning;

public class Customer1 implements Cloneable {
    String name;
    acc c = new acc();
    public Customer1(String name, int balance) {
    	this. name = name;
    	this.c.balance = balance;
    }
   	@Override
    protected Object clone() throws CloneNotSupportedException {
    	Customer1 ctm = (Customer1)super.clone();
    	ctm.c =(acc) c.clone();
    	return ctm;
   	}
}
