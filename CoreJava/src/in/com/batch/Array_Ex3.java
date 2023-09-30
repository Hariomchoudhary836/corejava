package in.com.batch;

public class Array_Ex3 {
	 public static void main(String[] args) {
			int []num = new int[5];
			
			num [0]=101;
			num [1]=102;
			num [2]=103;
			num [3]=104;
			num [4]=105;
			
			for(int i=0;i<num.length;i++) {
			if(num[i]%2 == 0) {
				System.out.println("even no. is "+num[i]);
			} else {
				System.out.println("odd no. is "+num[i]);
			}
				
			}
}
}