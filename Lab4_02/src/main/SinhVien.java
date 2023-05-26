package main;

public class SinhVien extends Nguoi {
   private String lop;
   private String nghanh;
   private Truong truong;

   
   
 public SinhVien() {
	super();
	this.lop="";
	this.nghanh="";
	this.truong=new Truong();
}
 public SinhVien(String Ten ,int Tuoi,char GioiTinh,String Lop,String Nganh,Truong truong) {
  super(Ten,Tuoi,GioiTinh);
  this.lop=Lop;
  this.nghanh=Nganh;
  this.truong=truong;s

 }
public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("SinhVien [lop=").append(lop).append(", nghanh=").append(nghanh).append(", truong=").append(truong)
			.append("]");
	return buffer.toString();
}
   
}
