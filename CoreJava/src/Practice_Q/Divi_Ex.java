package Practice_Q;

public class Divi_Ex {
   public static void main(String[] args) {
	int a = 4;
	int count = 0;
	int sum = 0;
	
	for (int i = 100; i<=200 ; i++) {
		if (i%4==0) {
			count = i;
			System.out.println(count);
			sum = sum+i;
		}
	}
	System.out.println(sum);
}
}
