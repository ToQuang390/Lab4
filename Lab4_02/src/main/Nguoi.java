package main;

public class Nguoi {
protected String ten;
protected int tuoi;
protected char gioiTinh;
public Nguoi() {
	this.ten="";
	this.tuoi=1;
	this.gioiTinh='1';
}
public Nguoi(String ten, int tuoi, char gioiTinh) {
	super();
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioiTinh = gioiTinh;
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
	StringBuffer buffer = new StringBuffer();
	buffer.append("Nguoi [ten=").append(ten).append(", tuoi=").append(tuoi).append(", gioiTinh=").append(gioiTinh)
			.append("]");
	return buffer.toString();
}


}
