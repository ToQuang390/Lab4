package main;

public class PartTimeEmployee  extends Employee{
  private int hoursPerWeek;
  
  public PartTimeEmployee() {
	  super();
	  this.hoursPerWeek=1;
  }
  public void setHoursPerWeek(int hoursPerWeek) {
	  this.hoursPerWeek=hoursPerWeek;
  }
  public int GethoursPerWeek() {
	  return this.hoursPerWeek;
  }
public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("PartTimeEmployee [hoursPerWeek=").append(hoursPerWeek).append("]");
	return buffer.toString();
}
	
}
