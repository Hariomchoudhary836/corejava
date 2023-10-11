package Agenda;

import java.util.LinkedList;

public class List_Methods {
 public static void main(String[] args) {
	LinkedList a1 = new LinkedList();
	a1.add("Hariom");
	a1.add(12);
	a1.add("mohan");
	a1.add(0, 13);
	System.out.println(a1);
	
	System.out.println(a1.get(2));
	
	a1.remove(2);
	System.out.println(a1);
    
    System.out.println("index postion "+a1.indexOf("mohan"));
    
    a1.set(0, 14);
    System.out.println(a1);
    
    System.out.println(a1.lastIndexOf("mohan"));
    
    System.out.println(a1.subList(0, 2));
}
}
