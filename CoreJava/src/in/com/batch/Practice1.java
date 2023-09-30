/*package in.com.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice1 {
	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(date);
		System.out.println(str);
		
	}

}*/

package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice1{
	public static void main(String []args) throws ParseException {
		Date date = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      String str=sdf.format(date);
     System.out.println(str);
      System.out.println(sdf.parse(str));
	}
}