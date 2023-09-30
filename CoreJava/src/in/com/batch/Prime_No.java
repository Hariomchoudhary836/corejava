package in.com.batch;

public class Prime_No {
public static void main(String[] args) {

     int num = 7;
     int count = 0;
     
     for(int i = 2;i<num; i++) {
    	 if (num%i==0) {
    		 count++;
    	 }
     }
    		 if (count == 0) {
				System.out.println("yes it is prime no.");
			}else {
				System.out.println("it is no prime no.");
			}
    	 }
     }