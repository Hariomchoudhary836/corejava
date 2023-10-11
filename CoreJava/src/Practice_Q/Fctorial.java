package Practice_Q;

import java.util.Scanner;

public class Fctorial {
  public static void main(String[] args) {
	int a = 1;
	int b = 1;
	Scanner sc = new Scanner(System.in);
	int p = sc.nextInt();
	while(a<=p) {
		b=a*b;
		a++;
	}
	System.out.println(b);
}
}
