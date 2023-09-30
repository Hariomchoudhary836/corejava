package in.com.batch;

public class String_Buffer_Classs {
   public static void main(String []args) {
	   StringBuffer sb = new StringBuffer("Vijay"); 
			  sb.append("Dinanath Chohan");
	  System.out.println("Length:"+sb.length());
	  System.out.println("Capacity:"+sb.capacity());
	  System.out.println("Char at:"+sb.charAt(1));
	  System.out.println("Index of:"+sb.indexOf("Dinanth"));
	  System.out.println("Replace:"+sb.replace(0,5,"Jay "));
	  
   }
}
