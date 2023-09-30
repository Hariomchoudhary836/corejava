package in.com.batch;

public class Switch_Ex {
      public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result;
		char operator='+';
		switch (operator) {
			case '+':
				result=num1+num2;
				System.out.println("add is"+result);
				break;
			case'-':
				result=num1-num2;
				System.out.println("sub is"+result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("mult is"+result);
				break;
			case'/':
				result=num1/num2;
				System.out.println("div is"+result);
			default:
				System.out.println("default");
				break;
		}
	}
}
