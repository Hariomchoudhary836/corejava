package Agenda;

import java.util.ArrayList;
import java.util.Collection;
public class testcollection {

public static void main(String[] args) {
	Collection c = new ArrayList();
	
	c.add(1);
	c.add(2);
	c.add("Hariom");
	c.add("rahul");
	c.add(12.0);
	c.add("rays");
	System.out.println(c);
	
	Collection c1 = new ArrayList();
	c1.add("dilip");
	c1.add("Shiv");
	c.add('a');
	c.add(null);
	System.out.println(c1);
	System.out.println(c);
	c.addAll(c1);
	System.out.println(c);
//	c.clear();
//	System.out.println(c);	
	
	System.out.println(c.contains("rays"));
	System.out.println(c.containsAll(c1));
   // c.clear();
    System.out.println(c.isEmpty());
    c.remove("rays");
    System.out.println(c);
    System.out.println(c.retainAll(c));
    c.size();
    System.out.println();
     
}
}
