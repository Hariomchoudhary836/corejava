package in.com.batch;

public class StringOpretion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name = "HARIOM CHOUDHARY";
     System.out.println("length =" +name.length());
     System.out.println("charAt ="+name.charAt(5));
     System.out.println("lower ="+name.toLowerCase());
     System.out.println("upper ="+name.toUpperCase());
     System.out.println("7th characture is ="+name.charAt(6));
     System.out.println("Hari index is ="+name.indexOf("Hari"));
     System.out.println("first i position ="+name.indexOf("i"));
     System.out.println("jai shree ="+name.toLowerCase());
     System.out.println("Starts With vijay ="+name.startsWith("vijay"));
	 System.out.println("ends with han="+name.endsWith("han"));
	 System.out.println("DADA vijay ="+name.toUpperCase());
	 System.out.println("a is replaced by b ="+name.replace("a","b"));
	}
}