package Collection;

public class Emp_hashcode {
	   private int id = 0;
	   private String name = null;
	   private String address = null;
	   
	   public Emp_hashcode(int id, String name, String address) {
		   this.id = id;
		   this.name = name;
		   this.address = address;
	   }
	 	@Override
	public String toString() {
		return id+" "+name+" "+address;
	}
	 	@Override
	 	public boolean equals(Object obj) {
	 		if(!(obj instanceof Emp_hashcode)) {
	 		return false;
	 	}
	 		Emp_hashcode e = (Emp_hashcode) obj;
	 		boolean b = this.id == e.id && this.name == e.name && this.address == e.address;
			return b;
        }
	 	@Override
	 	public int hashCode() {
	 		String hs = id + name + address;
	 		return hs.hashCode();
	 	}
}
 