package in.com.Hash_Maps;

public class Car {
  String cname;
  String ctype;
  int cprice;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public int getCprice() {
	return cprice;
}
public void setCprice(int cprice) {
	this.cprice = cprice;
}
@Override
public String toString() {
	return "Car [cname=" + cname + ", ctype=" + ctype + ", cprice=" + cprice + "]";
}
  
}
