package in.com.Set_Get;

import java.util.Scanner;

public class Shao_Main12 {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the borderwidth");
		int Boderwidth = b.nextInt();
		
		System.out.println("Enter the color");
		String Color = b.next();
		
		   shape1 s = new shape1();
		s.setBorderwidth(Boderwidth);
		   s.setColor(Color);
		   s.dip();
		
			System.out.println("Enter the hight of trisngle..");
			int Height = b.nextInt();
			
			System.out.println("Enter the base of triangle");
			int Base = b.nextInt();
			
		   Triangle t = new Triangle();
		   t.setHeight(Height);
		   t.setBase(Base);
		   t.area();
		   
		   System.out.println("Enter the radius of circle");
		   int Radius = b.nextInt();
		   
		   Circle c = new Circle();
		   c.setRadius(Radius);
		   c.circlearea();
	   }
	}

 class shape1{
		int borderwidth;
		String color;
		public int getBorderwidth() {
			return borderwidth;
		}
		public void setBorderwidth(int borderwidth) {
			this.borderwidth = borderwidth;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void dip() {
			System.out.println("enter the shape methad");
			System.out.println(color);
			System.out.println(borderwidth);
		}
	}

	class Triangle extends shape1{
		int height;
		int base;
		
		public void setHeight(int height) {
			this.height = height;
		}
		public int getHeight() {
			return height;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getBase() {
			return base;
		}
		public void area() {
			int Tarea = (getHeight()*getBase()/2);
			System.out.println("Triangle area...."+Tarea);
			}
		}
 
	class Circle{
		private int radius;
		public static final double PI = 3.14;

		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		public int getRadius() {
			return radius;
		}
		public void circlearea() {
        double Carea = PI * getRadius()* getRadius();
        System.out.println("Area of circle"+Carea);
		}
	}