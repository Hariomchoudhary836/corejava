package in.com.Set_Get;

import java.util.Scanner;

public class Test_class_room {
public static void main(String[] args) {
	  
	Class_room c = new Class_room();
	c.setColor("blue");
	c.setTables(50);
	c.setStudent(100);
	
	System.out.println(c.getColor());
	System.out.println(c.getTables());
	System.out.println(c.getStudent());
	
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the clas room color");
	  String color = sc.next();
	  
	  System.out.println("Enter the how many table are there");
	  int table = sc.nextInt();
	  
	  System.out.println("Enter the how may student in class room ");
	  int student = sc.nextInt();
	  
	  System.out.println("Enter the how many higth of the classs room");
	  int higth = sc.nextInt();
	  
	  System.out.println("Enter the class room length");
	  int length = sc.nextInt();
	  
	Room_size r = new Room_size();
	r.setHight(higth);
	r.setLength(length);
	r.setColor(color);
	r.setTables(table);
	r.setStudent(student);
	
	System.out.println(r.getHight());
	System.out.println(r.getLength());
	System.out.println(r.getColor());
	System.out.println(r.getTables());
	System.out.println(r.getStudent());
}
}