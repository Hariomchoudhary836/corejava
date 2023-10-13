package queue;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
 public static void main(String[] args) {
	ArrayList<Employee> e1 = new ArrayList<Employee>();
	e1.add(new Employee(10, "Hariom", "657483"));
	e1.add(new Employee(5, "Rahul", "45637"));
	e1.add(new Employee(3, "Mohan", "2345"));
	e1.add(new Employee(6, "Himanshu", "567890"));
	e1.add(new Employee(7, "Sham", "12345678"));
	
	System.out.println();
	
	Collections.sort(e1);
	System.out.println(e1);
}
}
