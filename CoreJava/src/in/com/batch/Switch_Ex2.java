/*package in.com.batch;

public class Switch_Ex2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result;
		char [] operator= {'+','-','*','/'};
		for(int i=0; i<operator.length; i++) {
		switch (operator[i]) {
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
				break;
			default:
				System.out.println("default");
				break;
		}
	}
}
}*/

package in.com.batch;

public class Switch_Ex2 {
	public static void main(String []args ) {
		String days;
		String [] Name = {"Mon","Thu","Wed","Thus","Fri","Sat","Sun"};
			for(int i=0; i<Name.length; i++) {
		switch (Name[i]) {
		case "Mon":
			//days = "Mon";
			System.out.println("Monday");
			break;
		case "Thu":
			//days = Tus;
		    System.out.println("Tuesday");
		    break;
		case "Wed":
			//days = Wed;
			System.out.println("Wednesday");
			break;
		case "Thus":
			//days = Thus;
			System.out.println("Thusday");
			break;
		case "Fri":
			//days = Fri;
			System.out.println("Friday");
			break;
		case "Sat":
			//days = Sat;
			System.out.println("Saturday");
			break;
		case "Sun":
			//days = Sun;
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Error");
		}
	}
}
}