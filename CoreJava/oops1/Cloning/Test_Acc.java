package Cloning;

public class Test_Acc {
    public static void main(String[] args) throws CloneNotSupportedException {
	  Account a1 = new Account();
	  Account a2 = (Account) a1.clone();
	  a2.balance=123;
	  System.out.println(a1.balance);
	  System.out.println(a2.balance);
    }
}
