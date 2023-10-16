package in.com.Set_Get;

import java.util.Scanner;

public class Shape_Ex2 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the color of Shape");
	  String color = sc.next();
	  
	  System.out.println("Enter the width of Shape");
	  int width = sc.nextInt();
	  
	  System.out.println("Enter the price of Shape");
	  int price = sc.nextInt();
	  
	Shape s1 = new Shape();
	s1.setColor(color);
	s1.setWidth(width);
	s1.setPrice(price);
	System.out.println("Shape color is : "+s1.getColor());
	System.out.println("Shape width is : "+s1.getWidth());
	System.out.println("Shape ptrice is : "+s1.getPrice());
}
}
