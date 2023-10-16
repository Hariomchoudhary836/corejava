package in.com.Hash_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class testStudent {
	public static void main(String[] args) {
   Student s1 = new Student("Mohan", 13, "rasgaon");
   Student s2 = new Student("Rahul", 14, "indor");
   Student s3 = new Student("hariom", 11, "lonara");
   
   Course c1 = new Course(12, "java", 124);
   Course c2 = new Course(13, "HTML", 234);
   Course c3 = new Course(15, "PHP", 200);
   
   HashMap<Student, Course> hm = new HashMap<>();
   hm.put(s1, c1);
   hm.put(s2, c2);
   hm.put(s3, c3);
   
   Set<Entry<Student,Course>>set = hm.entrySet();
   for(Map.Entry<Student, Course> map:set) {
	Student st = map.getKey();
	Course c = map.getValue();
	
	if (c.cname.equals("PHP")) {
		System.out.println(c);
	}
   }
}
}