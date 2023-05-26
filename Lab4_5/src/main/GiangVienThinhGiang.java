package main;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
	private int luongThang;
	private int soTietDay;
	private int donGia;
	private int thunhap;

	public void tinhLuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tiet day:");
		soTietDay = sc.nextInt();
		System.out.println("Don Gia:");
		donGia = sc.nextInt();
		thunhap = soTietDay * donGia;
	}

}
