package Hash_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Findesage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age...");
		System.out.println("Enter the name....");
		int age = 18;
		String name;
		HashMap<Integer , String> hm = new HashMap<>();
		HashMap<String, String> hm1 = new HashMap<>();
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		
		Set<Entry<Integer,String>>set = hm.entrySet();
		for (Map.Entry<Integer,String>map:set) {
			Integer i = map.getKey();
			String s = map.getValue();
			if (i>age) {
			name = "you are yuva";
			hm1.put(s,name);
			}
			else{
				name = "you are smaller";
				hm1.put(s,name);
			}	
		}
		Set<Entry<String,String>>set1 = hm1.entrySet();
		for (Map.Entry<String,String>map1:set1) {
		String s1 = map1.getKey();
		String s2 = map1.getValue();
		System.out.println(s1+" "+s2);}
	}
}
