package main;

import java.util.Scanner;

public class Test {

 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	PartTimeEmployee pt=new PartTimeEmployee();
	System.out.println("Mời bạn nhập tên: ");
	String name=sc.nextLine();
	pt.setName(name);
	System.out.println("Nhập tuổi: ");
	int tuoi=sc.nextInt();
	System.out.println("Gioi tinh:");
	char gender=sc.next().charAt(0);
	System.out.println("EmployerName: ");
	String employerName=sc.nextLine();
	pt.setEmployerName(employerName);
	sc.nextLine();
	System.out.println("DateHired");
	String datehired=sc.nextLine();
	pt.setDateHired(datehired);
	System.out.println("HoursPerWeek:");
	int hoursPerWeek=sc.nextInt();
	pt.setHoursPerWeek(hoursPerWeek);

	
	System.out.println("---Hiển thị thông tin--");
	System.out.println(pt.GetName());
	System.out.println(pt.GetTuoi());
	System.out.println(pt.Getgender());
	System.out.println(pt.GetemployerName());
	System.out.println(pt.GetDateHird());
	System.out.println(pt.GethoursPerWeek());

 }
}
