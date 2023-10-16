package in.com.Hash_Maps;

public class Course {
  int cid;
  String cname;
  int price;
public Course(int cid, String cname, int price) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.price = price;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
}
}
