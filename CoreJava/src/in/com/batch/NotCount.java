/*package in.com.batch;

public class NotCount {
	public static void main(String []args) {
		int money = 2890;
		int []not= {500,200,100,50,30,10};
		int count =0;
		for(int i= 0; i <not.length; i++) {
			count = money/not[i];
			
			if (count > 0) {
				System.out.println(not[i]+ "=" +count);
			}
			money=money%not[i]; 
		}
		}

}*/

package in.com.batch;

public class NotCount {
	public static void main(String []srgs) {
		int money = 50000;
		int []not = {500,400,200,50,10,5};
		int count = 0;
		for(int i= 0;i<not.length;i++) {
		count = money / not[i];
		
		if (count > 0) {
			System.out.println(not[i]+ "=" +count);
			
		}
		money = money % not[i];
	}
}
}
	