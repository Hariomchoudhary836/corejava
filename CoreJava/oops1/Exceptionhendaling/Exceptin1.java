package Exceptionhendaling;

public class Exceptin1 {
  public static void main(String[] args) {
	int a = 10;
	int b = 0;
	try {
		String name = "hariom";
		System.out.println(name.charAt(10));
		try {	
	} catch (Exception e) {
		System.out.println(e);
	}
		int c = a / b;
		System.out.println("division =" +c);		
	} catch (Exception e) {
		System.out.println(e);
}
}
}