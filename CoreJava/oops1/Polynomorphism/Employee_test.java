package Polynomorphism;

public class Employee_test {
public static void main(String[] args) {
	employee e = new devaloper();
	e.Showedetail();
	e.Showedetail("ram");
   }
}

  //first class
class employee{
   public void Showedetail() {
	   System.out.println("this is employee detail");
   }
   public void Showedetail(String s) {
	   System.out.println(s);
   }
}

  //second class
class devaloper extends employee{
   public void  Showedetail() {
	   super.Showedetail();
	   System.out.println("tshis is devaloper detail");
   }
   public void Showedetail(String s) {
	   super.Showedetail(s);
	   System.out.println(s);
   }
}
