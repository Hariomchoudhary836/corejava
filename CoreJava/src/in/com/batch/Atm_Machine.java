package in.com.batch;

import java.util.Scanner;

public class Atm_Machine { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int balance = 37890;
		int pin = 1234;
		System.out.println(" Enter the username : ");
		String username = sc.next();
		System.out.println(" Enter your pin....");
	    int u_pin = sc.nextInt();
	    System.out.println(" !!WELLCOME TO MPGB !!");
	    System.out.println("WELCOME ..."+username);
		int choice = 0;
		if(pin == u_pin) {
		do {
			System.out.println(" 1 WITHDROW");
			System.out.println(" 2 DEPOSIT");
			System.out.println(" 3 CHECK BALANCE");
			System.out.println(" 4 EXIT");
			
			System.out.println(" !! ENTER your choice !! ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println(" !! Withdrow amount !! ");
				int withdrow = sc.nextInt();
				if(withdrow > balance) {
					System.out.println(" ! Succesfilly withdow amount !");
					System.out.println("! please check withdrow !");
				}
				else {
					balance = balance-withdrow;
					System.out.println("!succesfully amount withdrow!");
					System.out.println("  Please check withdrow  ");
				}
				break;
			}
			case 2:{
				System.out.println(" !!Enter the amount!! ");
				int dep = sc.nextInt();
				
				balance = balance+dep;
				System.out.println("!!! succesfully deposit your amount !!!");
				System.out.println(" !check amount after deposit");
				break;
			}
			case 3:{
				System.out.println(" your balance......"+balance);
				break;
			}
			case 4:{
				System.exit(0);
			}
			}
	       }while(choice != 4);
		}
		else {
			System.out.println("please check your pin..");
		}
	}
}