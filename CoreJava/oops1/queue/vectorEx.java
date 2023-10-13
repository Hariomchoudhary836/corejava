package queue;

import java.util.Enumeration;
import java.util.Vector;

public class vectorEx {
  public static void main(String[] args) {
	Vector v = new Vector();
	v.add(100);
	v.add(101);
	v.add(102);
	v.add(103);
	v.add("Hariom");
	v.add("Himanshu");
	
	System.out.println(v);
	
	Enumeration e = v.elements();
	v.add("Mohan");
	v.add("rahul");
	
	System.out.println(v);
	
	while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	}
}
}
