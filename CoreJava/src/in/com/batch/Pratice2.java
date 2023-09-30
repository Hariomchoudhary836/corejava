/*package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pratice2{
	public static void main(String[] args) throws ParseException {
		String str="18/09/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Date date =sdf.parse(str);
		System.out.println(date);
	}
	
}*/
package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Pratice2{
	public static void main(String []args) throws ParseException {
		String str="18/09/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYYY");
		Date date =sdf.parse(str);
		System.out.println(date);
	}
}