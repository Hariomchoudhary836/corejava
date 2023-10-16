package in.com.Exceptionhendaling;

public class outofbound {
   public static void main(String[] args) {
	String name = "hariom";
	
	try {
		System.out.println(name.charAt(8));
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
