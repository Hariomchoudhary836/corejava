package Cloning;

public class company implements Cloneable {
  String manager;
  
  salary sl = new salary();
  public company(String manager, int money) {
	  this.manager = manager;
	this.sl.money = money;
  }
  @Override
	protected Object clone() throws CloneNotSupportedException {
		company cp = (company) super.clone();
		cp.sl = (salary)sl.clone();
		return cp;
	}
}