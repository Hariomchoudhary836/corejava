package Agrigation_ArrayList;

public class company {
String C_name;
 String C_location;
 Employe e;
 
 public company(String C_name,String C_location,Employe e) {
	 super();
	 this.C_name = C_name;
	 this.C_location = C_location;
	 this.e = e;
	 
 }
 @Override
	public String toString() {
		return "Company [C_name = " + C_name +", C_location="+ C_location + ", e="+ e + "]";
	}
}
