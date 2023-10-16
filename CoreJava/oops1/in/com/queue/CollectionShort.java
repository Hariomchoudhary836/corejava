package in.com.queue;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionShort {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<Integer>();
     
	marks.add(75);
	marks.add(80);
	marks.add(66);
	marks.add(70);
	marks.add(60);
	marks.add(55);
	marks.add(30);
	
	System.out.println(marks);
	
	System.out.println("  Afer sorting ");
	Collections.sort(marks);
	System.out.println(marks);
}
}
