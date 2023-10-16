package in.com.Hash_set;

public class Bankers implements Comparable<Bankers>{
   int id;
   String name;
   int mob_;
   String location;
   
public Bankers(int id, String name, int mob_, String location) {
	super();
	this.id = id;
	this.name = name;
	this.mob_ = mob_;
	this.location = location;
}

@Override
public String toString() {
	return "Bankers [id=" + id + ", name=" + name + ", mob_=" + mob_ + ", location=" + location + "]";
}

@Override
public int compareTo(Bankers o) {
	if (this.id>o.id) 
		return 1;
		else if (this.id<o.id) 
			return -1;
	return 0;
}
   
}
