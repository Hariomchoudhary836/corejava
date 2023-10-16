package in.com.Coparatorhari;

import java.util.Comparator;

public class Comparatorname implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}  
}