package main;

public class SinhVien extends Nguoi {
  private String lop;
  private String nganh;
  private   Truong truong;
  
  public SinhVien() {
	  super();
	  this.lop="null";
	  this.nganh=nganh;
	  this.truong= new Truong();
	  
  }
  
  public void setLop( String lop) {
	  this.lop=lop;
  }
  public void setNganh(String nganh) {
	  this.nganh=nganh;
  }
  public void setTruong(Truong truong) {
	  this.truong=truong;
  }
  public String getLop() {
	  return this.lop;
  }
  public String getNganh() {
	  return this.nganh;
  }
  public Truong getTruong() {
	  return this.truong;
  }

public String toString() {
	return "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
}
  
  
}
