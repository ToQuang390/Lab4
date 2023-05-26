package lab4_06;

import java.util.Scanner;

public class CNTCN extends CongNhan {
	private float luongCB;
	private int heSoLuong;
	private float thuong;
	private int soNgayCong;
	private float luongThang;
public CNTCN() {
	super();
	this.luongCB=0;
	this.heSoLuong=0;
	this.thuong=0;
	this.soNgayCong=0;
	this.luongThang=0;
}
public void TinhLuong() {
	Scanner sc =new Scanner(System.in);
		System.out.println("Lương cơ bản: ");
		this.luongCB=sc.nextInt();
		System.out.println("Hệ số lương;");
		this.heSoLuong=sc.nextInt();
		System.out.println("Số ngày công: ");
		this.soNgayCong=sc.nextInt();
		if(soNgayCong<20) {
			thuong=0;
			luongThang=luongCB*heSoLuong+thuong;
		System.out.println("Lương tháng="+this.luongThang);
		}
		else if(soNgayCong>=20) {
			thuong= (float) (1.2*this.luongCB);
		}
		
	}

}
