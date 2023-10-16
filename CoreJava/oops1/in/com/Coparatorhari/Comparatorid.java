package in.com.Coparatorhari;

import java.util.Comparator;

public class Comparatorid implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmpId() - o2.getEmpId();
	}
}