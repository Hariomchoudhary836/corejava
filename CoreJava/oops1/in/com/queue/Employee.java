package in.com.queue;

public class Employee implements Comparable<Employee>  {
   private int empId;
   private String name;
   private String phone;
   
   public Employee(int empId,String name,String phone) {
	this.empId = empId;
	this.name = name;
	this.phone = phone;
   }

@Override
public int compareTo(Employee o) {
	return this.empId - o.empId;
   }
  @Override
	public String toString() {
		
		return empId + " "+ name +" "+phone;
	}
}
