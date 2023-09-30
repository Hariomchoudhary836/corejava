package Set_Get;

public class Test_A {
     public static void main(String[] args) {
		ClassA c = new ClassA();
		ClassA c1 = new ClassA(1000);
		ClassA c2 = new ClassA(10.78,"Hariom",40.6f);
		
		System.out.println(c.a+" "+c.b+" "+c+" "+c.d);
		System.out.println(c1.a);
		System.out.println(c2.b+" "+c2.c+" "+c2.d);
	}
}
