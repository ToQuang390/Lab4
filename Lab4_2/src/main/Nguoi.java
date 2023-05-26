package main;

public class Nguoi {
   protected String ten;
   protected int tuoi;
   protected char gioiTinh;
   
   public Nguoi(){
	   this.ten="null";
	   this.tuoi=0;
	   this.gioiTinh='1';
   }
   
   public Nguoi(String ten,int tuoi,char gioiTinh) {
	   this.ten=ten;
	   this.tuoi=tuoi;
	   this.gioiTinh=gioiTinh;
   }
   
   public void setTen(String ten) {
	   this.ten=ten;
   }
   public void setTuoi(int tuoi) {
	   this.tuoi=tuoi;
   }
   public void setGioiTinh(char gioiTinh) {
	   this.gioiTinh=gioiTinh;
   }
   public String getTen() {
	   return this.ten;
   }
   public int getTuoi() {
	   return this.tuoi;
   }
   public char getGioiTinh() {
	   return gioiTinh;
   }
}