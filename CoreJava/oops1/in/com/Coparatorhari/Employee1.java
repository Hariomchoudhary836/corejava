package in.com.Coparatorhari;

public class Employee1 {
    private int empId;
    private String name;
    private String phone;
    
	public Employee1(int empId, String name, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
	}
}

