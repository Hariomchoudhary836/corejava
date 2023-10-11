package Exceptionhendaling;

public class nullpointer {
	public static void main(String[] args) {
   String a = null;
   
    try {
    	System.out.println(a.charAt(2));
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}