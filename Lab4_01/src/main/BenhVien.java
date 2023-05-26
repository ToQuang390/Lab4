package main;

public class BenhVien {
  private String ten;
  private String diaChi;
  private String giamDoc;
public BenhVien() {

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
public String getGiamDoc() {
	return giamDoc;
}
public void setGiamDoc(String giamDoc) {
	this.giamDoc = giamDoc;
}
  
  public String toString() {
		// TODO Auto-generated method stub
		return "Tên="+this.ten+"\n" +"Địa chỉ"+this.diaChi+"\n"+"Giám Đốc"+this.giamDoc;
	}
	
	
} 
