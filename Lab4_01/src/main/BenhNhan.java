package main;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhvien;
	public BenhNhan() {
		this.tienSu="null";
		this.chuanDoan="null";
		benhvien=new BenhVien();
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tiensu) {
		this.tienSu = tiensu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhvien() {
		return benhvien;
	}
	public void setBenhvien(BenhVien benhvien) {
		this.benhvien = benhvien;
	}
	public String toString() {
		return "BenhNhan"+"\n"+"Tên:"+this.getTuoi()+"\n"+"Tuổi"+this.getTuoi()+"\n"
				+"Giới Tính"+this.getGioiTinh()+"\n"
				+"Tiền sử:" + this.getTienSu()
				+"\n"+ "chuanDoan:" + this.getChuanDoan() + "\n"
				+"Tên bệnh viện" + benhvien.getTen() +"\n"
				+"Địa chỉ"+benhvien.getDiaChi()
				+"\n"+"Giám đốc"+benhvien.getGiamDoc();
	}


}
