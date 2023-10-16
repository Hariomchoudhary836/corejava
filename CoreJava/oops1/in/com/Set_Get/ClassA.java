package in.com.Set_Get;

public class ClassA {
   int a; double b; String c; float d; ///instance veriable
   
   public ClassA() {  //defult constructor
	   a = 100; b = 90.7; c = "name"; d = 67.76f;
   }
   public ClassA(int x) { //one paramitar constructor
	   a = x;
   }
   public ClassA(double ha,String ri, float om) {//two paramitor constructor
	   b = ha;
	   c = ri;
	   d = om;
   }
}
