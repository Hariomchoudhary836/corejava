package Agrigation_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import Cloning.company;

public class Emp_comp_main {
     ArrayList<Company>a1 = new ArrayList<>();
     void cheakCity(ArrayLiat<Company>a1) {
    	 Iterator<Company1>it = a1.iterator();
    	 while(it.hasNext()) {
    	Company1 c= it.next();
    	if(c.C_locetion.equalsIgnore("noida")) {
    		System.out.println(c.C_name+" "+c.e.eid+" "+c.e.ename+" "+c.e.salary+" "+c.e.department);
    	}
    }
}
     void cheakCompany(ArrayList<company>a1) {
    	 Iterator<Company1>it = a1.iterator();
    	 while(it.hasNext()) {
    		 Company1 cm2 = it.next();
    		 if (cm2.C_name.equalsIgnoreCase("hcl")) {
				System.out.println(cm2.e.eid+" "+cm2.e.ename+" "cm2.e.department+" "cm2.e.salary+" "+cm2.clocation);
    	     }
    	 }
     }
     
}
