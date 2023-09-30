package in.com.batch;

public class Type_Cast {
	public static void main(String[] args) {
//Type casting is a way of converting data from one data type to another data type
	//implicit
	int a = 10;
	double b = a;
    System.out.println(b);
	
    //explict
    double c = 20;
    int d = (int)c;
    System.out.println(d);
    
    //implicit
    short e = 50;
    float f = e;
    System.out.println(f);
    
    //explict
    float g = 30.87f;
    short h = (short)g;
    System.out.println(h);
	}
}
