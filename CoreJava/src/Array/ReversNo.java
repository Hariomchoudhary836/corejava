package Array;

import java.util.Scanner;

public class ReversNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array : ");
	int size=sc.nextInt();
	System.out.println("Enter the number of Array :  ");
	int []num=new int [size];
	for(int i=0;i<size; i++) {
		num[i]=sc.nextInt();
	}
			for (int i=size-1; i>=0; i--) {
				System.out.println(num[i]);
			}
	}
}