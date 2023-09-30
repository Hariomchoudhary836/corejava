package Set_Get;

import java.util.Scanner;

public class RaysClassTest {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Ccg name");
		  String name = sc.next();
		  
		  System.out.println("Enter the Room");
		  int room = sc.nextInt();
		  
		  System.out.println("Enter the Lebroom");
		  int lebroom = sc.nextInt();
		  
		  System.out.println("Enter the Fees");
		  int fees = sc.nextInt();
		  

   RaysTecnology r1 = new RaysTecnology();
   r1.setName(name);
   r1.setRoom(room);
   r1.setRoom(lebroom);
   r1.setFees(fees);
  System.out.println("Coching name is : "+r1.getName());
  System.out.println("class room is : "+r1.getRoom());
  System.out.println("how many fees is : "+r1.getFees());
}
}