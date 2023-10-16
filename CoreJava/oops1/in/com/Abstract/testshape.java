package in.com.Abstract;
public class testshape{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		r.Hello();
	
     Shape s = new Shape() {
		
		@Override
		public void area() {
		System.out.println("this is shape area");
			
		}
	};
	s.Hello();
	s.area();
	}
}

abstract class Shape {
   public void Hello() {
	   System.out.println("hello. evryone");
   }
   public abstract void area();
}
 class Rectangle extends Shape{
	public void area() {
		System.out.println("this is rectangle area");
	}
}
