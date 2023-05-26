package main;

public class Person {
  protected String name;
  private int tuoi;
  private char genDer;
  
  public Person() {
	  this.name="No";
	  this.tuoi=10;
	  this.genDer='1';
  }
  public void setName(String name) {
	  this.name=name;
  }
  public void setTuoi(int tuoi) {
	  this.tuoi=tuoi;
  }
  public void setGender(char gender) {
	  this.genDer=gender;
  }
  public String GetName() {
	  return this.name;
  }
  public int GetTuoi() {
	  return this.tuoi;
  }
  public char Getgender() {
	  return this.genDer;
  }
public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("Person [name=").append(name).append(", tuoi=").append(tuoi).append(", genDer=").append(genDer)
			.append("]");
	return buffer.toString();
}
 
	
}
