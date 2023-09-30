package in.com.batch;

import java.util.Scanner;

public class Movie_Theater {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the name..");
	String name = sc.next();
	System.out.println("Enter the price..");
	double price = sc.nextDouble();
	System.out.println("Enter the code  .");
	int code = sc.nextInt();
	System.out.println("!! WELLCOME TO INOXE !!");
	if(code==100) {
		price = price - (price * 0.10f);
		System.out.println(name);
		System.out.println(" Congratuletion after discount is...."+price);
	}
	else if(code == 1899) {
		price = price - price * 0.05f;
		System.out.println(" Congratuletion after discout is.."+price);
	}
	else {
		System.out.println("pleas collect the ticket....");
	}
	}
}
