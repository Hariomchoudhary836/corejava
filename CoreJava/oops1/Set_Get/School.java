package Set_Get;

public class School {
  public static String name ="P.A.T";
  int room ;
  int staff;
  int bus;
  String principal;
  int student;
public School(int room, int staff, int bus, String principal, int student) {
	super();
	this.room = room;
	this.staff = staff;
	this.bus = bus;
	this.principal = principal;
	this.student = student;
}
public static String getName() {
	return name;
}
public static void setName(String name) {
	School.name = name;
}
public int getRoom() {
	return room;
}
public void setRoom(int room) {
	this.room = room;
}
public int getStaff() {
	return staff;
}
public void setStaff(int staff) {
	this.staff = staff;
}
public int getBus() {
	return bus;
}
public void setBus(int bus) {
	this.bus = bus;
}
public String getPrincipal() {
	return principal;
}
public void setPrincipal(String principal) {
	this.principal = principal;
}
public int getStudent() {
	return student;
}
public void setStudent(int student) {
	this.student = student;
}
 public void Display1() {
	  System.out.println("room of school : "+room);
	  System.out.println("staff rooms : "+staff);
	  System.out.println("bus count : "+bus);
	  System.out.println("principal room : "+principal);
	  System.out.println("student count : "+student);
 }
}
