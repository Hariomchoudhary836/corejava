package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {

public static void main(String[] args){
	Employee e1 = new Employee(350, "Hariom", "Rasgaon");
	Employee e2 = new Employee(250, "Mohit","Indore");
	
	ArrayList Em = new ArrayList();
	Em.add(e1);
	Em.add(e2);
	
	       // Method 1
	
//	Employee e = (Employee) Em.get(0); 
//	System.out.println(e);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAddress());
	
	       // Method 2
	
//	for (int i = 0; i < Em.size(); i++) {
//		Employee e = (Employee) Em.get(i);
//		System.out.println(e);
//	}
	
	       // Method 3
	
//	for (Object object : Em) {
//		Employee e = (Employee) object;
//		System.out.println(e);
//	}
	
	       // Method 4
	
	Iterator it = Em.iterator();
	while (it.hasNext()) {
		Employee e = (Employee) it.next();
		System.out.println(e);
	}
}
}
