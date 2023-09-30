package in.com.batch;

public class for_Each_loop {
   public static void main(String[] args) {
	double []No = new double[6];
	
	No[0] = 450.87;
	No[1] = 600.78;
	No[2] = 400.22;
	No[3] = 300.11;
	No[4] = 100.98;
	No[5] = 320.88;
	
	for (double d1 : No) {
		System.out.println(d1);
		
	}
}
}