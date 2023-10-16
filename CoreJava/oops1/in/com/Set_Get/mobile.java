package in.com.Set_Get;

import java.util.Scanner;

class mobileshope{
	
	public void mobile() {
		System.out.println("WELLCOME to my shope  to the biggest sale");
		System.out.println("Diwali discount .. 50%");
}

	
}
class Newshope extends mobileshope{
	String name;
	String choice;
	double price;
	double discount;
	
	public Newshope(String name, String choice, double price) {
		super();
		this.name = name;
		this.choice = choice;
		this.price = price;
		//this.discount = discount;
	}

	public void dis() {
		discount=price-price*0.10f;
		System.out.println("Customer   name ..."+name);
		System.out.println("your choice mo...."+choice);
		System.out.println("Enter the mob. price .."+price);
		System.out.println("Discount after pay mony.."+discount);
	}
}

public class mobile {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the custmor mane...");
		String name = sc.next();
		System.out.println("choice your mob...");
		String choice = sc.next();
		System.out.println("show the price");
		int price = sc.nextInt();
		Newshope n=new Newshope(name, choice, price);
		n.dis();
		
	}
}
