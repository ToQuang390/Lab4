package main;

import java.util.Scanner;

public abstract class GiangVien {
   protected String hoTen;
   protected String diaChi;
   protected String loaiGiangVien;
   
   
   
   public GiangVien() {
	this.hoTen="null";
	this.diaChi="null";
	this.loaiGiangVien="null";
}
public void NhapThongTin() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("moi ban nhap ho ten: ");
	   String ht=sc.nextLine();
	   this.hoTen=ht;
	   System.out.println("Dia chi: ");
	   String dc=sc.nextLine();
	   this.diaChi=dc;
	   System.out.println("Loai Giang Vien:");
	   String lgv=sc.nextLine();
	   this.loaiGiangVien=lgv;
   }
   public abstract void tinhLuong();
   public void inThongTin() {
	   System.out.println("Ho ten:"+this.hoTen);
	   System.out.println("Đia chỉ:"+this.diaChi);
	   System.out.println("Loại Giang vien:"+this.loaiGiangVien);
	   System.out.println("Luong Thang"+this.loaiGiangVien);
   }
   
}
