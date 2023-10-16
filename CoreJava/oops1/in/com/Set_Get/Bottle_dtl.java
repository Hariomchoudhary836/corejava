package in.com.Set_Get;

import java.util.Scanner;

public class Bottle_dtl {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Show the bottel color");
	String color = sc.next();
	
	System.out.println("Show the bottle hight");
	int hight = sc.nextInt();
	
	System.out.println("Show the bottle length");
	int length = sc.nextInt();
	
	System.out.println("show the bottle price");
	int price = sc.nextInt();
	
	bottle s1 = new bottle();
	s1.setColor(color);
	s1.setHight(hight);
	s1.setLength(length);
	s1.setPrice(price);
	
	System.out.println("bottle color is : "+s1.getColor());
	System.out.println("bottle hight is : "+s1.getHight());
	System.out.println("bottle lenght is : "+s1.getLength());
	System.out.println("bottle price is : "+s1.getPrice());
}
}
