package in.com.batch;

import java.util.Scanner;

public class Two_D_Ex2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the size of array");
	int size = sc.nextInt();
	int number[] = new int[size];
	
	System.out.println("Enter the value");
	for (int i = 0; i < number.length; i++) {
		number [i] = sc.nextInt();
	}
	System.out.println("Enter the no.");
	   int x = sc.nextInt();
	  for (int i = 0; i < number.length; i++) {
      //System.out.println(number[i]);
		if (number [i]==x) {
			System.out.println("index of value="+i);
		}
	  }
  }
}
