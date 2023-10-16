package in.com.Hash_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ShowcarTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Showroom name...");
	String sname = sc.next();
	System.out.println("Enter the Showroom location..");
	String slocation = sc.next();
	
	System.out.println("Enter the car name ...");
	String cname = sc.next();
	System.out.println("Enter the type..");
	String ctype = sc.next();
	System.out.println("Enter the price...");
	int cprice = sc.nextInt();
	
	Showroom s = new Showroom();
	s.setSname(sname);
	s.setSlocation(slocation);
	
	Showroom s1 = new Showroom();
	s1.setSname(sname);
	s1.setSlocation(slocation);
	
	Showroom s2 = new Showroom();
	s2.setSname(sname);
	s2.setSlocation(slocation);
	
	Car c = new Car();
	c.setCname(cname);
	c.setCname(ctype);
	c.setCname(cprice);
	
	Car c1 = new Car();
	c1.setCname(cname);
	c1.setCname(ctype);
	c1.setCname(cprice);
	
	
	HashMap<Showroom, Car> hm = new HashMap<>();
	hm.put(s, c);
	hm.put(s1, c1);
	hm.put(s2, c1);
	 
    Set<Entry<Showroom, Car>>set = hm.entrySet();
    for (Map.Entry<Showroom, Car>map:set) {
		S
	}
}
}
