package main;

public class Nguoi {
   protected String ten;
   protected int tuoi;
   protected char gioiTinh;
   
   public Nguoi() {
	   ten="";
	   tuoi=0;
	   gioiTinh='n';
   }
   public Nguoi(String ten,int tuoi,char gioiTinh) {
	   this.ten=ten;
	   this.tuoi=tuoi;
	   this.gioiTinh=gioiTinh;
   }
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public char getGioiTinh() {
	return gioiTinh;
}
public void setGioiTinh(char gioiTinh) {
	this.gioiTinh = gioiTinh;
}
public String toString() {
	return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
}
   
   
}
