package Practice_Q;

public class Largest_noArr {
  public static void main(String[] args) {
	int [] arr = {2,4,6,8,4,56,45};
	int a=0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>a) {
			a=arr[i];
		}
	}
	System.out.println(a);
}
}
