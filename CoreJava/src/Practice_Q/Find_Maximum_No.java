package Practice_Q;

public class Find_Maximum_No {
   public static void main(String[] args) {
	int arr[]= {20,23,30,32,11,14,40,70,60};
	int max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
}
}
