package in.com.Hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Banks_main {

	public static void main(String[] args) {
		HashSet<Bankers> hs = new HashSet<Bankers>();
		Bankers b = new Bankers(109,"shyam",345655,"indore");
		Bankers b1 = new Bankers(107,"sarmaji",347635,"gheg");
		Bankers b2 = new Bankers(105,"sagar",345695,"lona");
		Bankers b3 = new Bankers(101,"hariom",345335,"ras");
		Bankers b4 = new Bankers(100,"lavish",345135,"segaon");
	    
		hs.add(b);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		
		TreeSet<Bankers> tr = new TreeSet<Bankers>();
		System.out.println(tr);
		
		Iterator<Bankers> it = hs.iterator();
		while (it.hasNext()) {
			Bankers ba = (Bankers) it.next();
			System.out.println(ba);
		}
	}
}
