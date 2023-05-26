package main;

public class Truong {
  private String ten;
  private String diaChi;
  private String hieuTruong;
  
public Truong() {
	this.ten="";
	this.diaChi="";
	this.hieuTruong="";
}
public Truong(String ten, String diaChi, String hieuTruong) {
	super();
	this.ten = ten;
	this.diaChi = diaChi;
	this.hieuTruong = hieuTruong;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getHieuTruong() {
	return hieuTruong;
}
public void setHieuTruong(String hieuTruong) {
	this.hieuTruong = hieuTruong;
}
public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("Truong [ten=").append(ten).append(", diaChi=").append(diaChi).append(", hieuTruong=")
			.append(hieuTruong).append("]");
	return buffer.toString();
}

  
}
