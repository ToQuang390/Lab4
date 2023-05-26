package lab4_06;

import java.util.Scanner;

public abstract class CongNhan {
	protected String hoVaTen;
	protected String diaChi;
	protected String ngaySinh;
	protected String loaiCN;

	public CongNhan() {
		this.hoVaTen = "null";
		this.diaChi = "null";
		this.ngaySinh = "null";
		this.loaiCN = "null";
	}

	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên:");
		String hoten = sc.nextLine();
		System.out.println("Địa Chỉ:");
		String diachi = sc.nextLine();
		System.out.println("Loại Công Nhân:");
		String loaiCN = sc.nextLine();
		this.hoVaTen = hoten;
		this.diaChi = diachi;
		this.loaiCN = loaiCN;
	}

	public abstract void TinhLuong();

	public void InthongTin() {
		System.out.println("Họ và tên:" + this.hoVaTen);
		System.out.println("Địa chỉ " + this.diaChi);
		System.out.println("Ngày sinh" + this.ngaySinh);
		System.out.println("Loại Công Nhân:" + this.loaiCN);
	}

}
