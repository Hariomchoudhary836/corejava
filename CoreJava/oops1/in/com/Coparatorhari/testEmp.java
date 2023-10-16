package in.com.Coparatorhari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testEmp {
  public static void main(String[] args) {
	ArrayList<Employee1> emp = new ArrayList<Employee1>();
	emp.add(new Employee1(3, "mohit", "34526"));
	emp.add(new Employee1(2, "hariom", "5463"));
	emp.add(new Employee1(4, "shyam", "34567"));
	emp.add(new Employee1(1, "himanshu", "45689"));
	
	System.out.println(emp);
	
	Collections.sort(emp,new Comparatorid());
	System.out.println(emp);
	
	ArrayList<Employee1> empn = new ArrayList<Employee1>(emp);
	Collections.sort(empn, new Comparatorname());
	System.out.println(empn);
	
	ArrayList<Employee1> empp = new ArrayList<Employee1>(emp);
	Collections.sort(empp, new Comparatorphone());
}
}
