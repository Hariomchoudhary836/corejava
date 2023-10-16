package in.com.Interface;

public class Bussinesmen implements Richman,socialwork{

	@Override
	public void EarnMoney() {
		System.out.println("EarnMoney");		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}

	@Override
	public void helptoOther() {
		System.out.println("help to many puple");
		
	}
	public static void main(String[] args) {
		socialwork s = new Bussinesmen();
		s.helptoOther();
		
			s.EarnMoney();
			s.donation();
			s.party();
			s.helptoOther();
		
	}
}

