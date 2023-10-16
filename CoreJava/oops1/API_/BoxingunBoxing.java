package API_;

public class BoxingunBoxing {
  public static void main(String[] args) {
	int a = 10;
	Integer b = new Integer(a);     //autoboxing
	System.out.println(a);
	System.out.println(b);
	
	Integer c = new Integer(100);   //unboxing
	int d = c;
	System.out.println(c);
	System.out.println(d);
}
}
