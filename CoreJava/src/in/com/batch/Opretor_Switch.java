package in.com.batch;

import java.util.Scanner;

public class Opretor_Switch {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int opretor = sc. nextInt();
		//+
		//-
		//*
		//./
		//%
		
		switch (opretor) {
		case 1:
			System.out.println(a+b);
			break;
		case 2: 
			System.out.println(a-b);
		case 3:
			System.out.println(a*b);
		if (b == 0) {
			System.out.println("Invalid divison");
		}
		else {
			System.out.println(a/b);
		}
		break;
		case 5:
			if (b == 0) {
			System.out.println("Invalid division");
		}else {
			System.out.println(a%b);
		}
			break;
			default : System.out.println("Invalid opretor");
	}
}
}