package main;

public class Employee extends Person {
	protected String employerName;
	protected String dateHired;

	public Employee() {
		super();
		this.employerName = "No";
		this.dateHired = "No";
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = this.dateHired;
	}

	public String GetemployerName() {
		return this.employerName;
	}

	public String GetDateHird() {
		return this.dateHired;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Employee [employerName=").append(employerName).append(", dateHired=").append(dateHired)
				.append("]");
		return buffer.toString();
	}
	
}
