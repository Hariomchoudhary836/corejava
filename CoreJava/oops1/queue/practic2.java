package queue;

import java.util.HashMap;
import java.util.Map;

public class practic2 {
public static void main(String[] args) {
	Map<String, Integer> num = new HashMap<String, Integer>();
	
	num.put("Hari", 1);
	num.put("Hariom", 2);
	num.put("mohan", 3);
	num.put("Rohan", 4);
	num.put("Dilip", 5);
	
	System.out.println(num);
	
//	num.clear();
//	System.out.println(num);
	
	System.out.println(num.containsKey("Hariom"));
	
	System.out.println(num.containsValue(3));
	
	System.out.println(num.entrySet());
	
	System.out.println(num.get("Rohan"));
	
	System.out.println(num.isEmpty());
	
	System.out.println(num.keySet());
	
	System.out.println(num.values());
	
	System.out.println(num.size());
}
}