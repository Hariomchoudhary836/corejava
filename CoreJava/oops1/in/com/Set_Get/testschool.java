package in.com.Set_Get;

import java.util.Scanner;

public class testschool {
public static void main(String[] args) {
	N_capsuletin_school n = new N_capsuletin_school();
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the school name");
	  String name = sc.next();
	  
	  System.out.println("Enter the school color");
	  String color = sc.next();
	  
	  System.out.println("how maney rooms aere there");
	  int room = sc.nextInt();
	  
	  System.out.println("how many fess in that school");
	  int fess = sc.nextInt();
	  
	n.setName(name);
	n.setColor(color);
	n.setRoom(room);
	n.setFess(fess);
	
	System.out.println(n.getName());
	System.out.println(n.getColor());
	System.out.println(n.getRoom());
	System.out.println(n.getFess());
}
}
