package Polynomorphism;

public class Student {
   public void read() {//compile time pol..
	   System.out.println("Student reading book");
   }
   public void read(String BookName) {
	   System.out.println("Student reading book "+BookName);
   }
   public void read(String Writer,int price) {
	   System.out.println(Writer);
	   System.out.println(price);
   }
}