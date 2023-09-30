package Set_Get;

import java.util.Scanner;

public class School_Managment {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many room are there");
		int room = sc. nextInt();
		
		System.out.println("How many staff room are there");
		int staff = sc.nextInt();
		
		System.out.println("kon hai principal");
		String principal = sc.next();
		
		System.out.println("how manty bus's are there");
		int bus = sc.nextInt();
		
		System.out.println("How many student are one class");
		int student = sc.nextInt();
	    School s = new School (room,staff,bus,principal,student);
    }
    
}
