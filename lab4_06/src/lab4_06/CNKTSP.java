package lab4_06;

import java.util.Scanner;

public class CNKTSP extends CongNhan {
	private int soSP;
	private int donGia;
	private int thuong;
	private int luongThang;

	public CNKTSP() {
		super();
		this.soSP=0;
		this.donGia=0;
		this.thuong=0;
		this.luongThang=0;	
	}
	public void TinhLuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số sản phẩm:");
		this.soSP = sc.nextInt();
		System.out.println("Nhập đơn giá:");
		if (soSP < 1000) {
			thuong = 0;

		} else if (soSP >= 1100) {
			thuong = 1000000;
			luongThang = soSP * donGia + thuong;
			System.out.println("Luong thang:");
		} else if (soSP >= 1150) {
			thuong = 1500000;
			luongThang = soSP * donGia + thuong;
		}

	}
}
