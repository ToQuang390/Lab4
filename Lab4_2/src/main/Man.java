package main;

import java.util.Scanner;

public class Man {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		SinhVien sv = new SinhVien();
		Truong trg = new Truong();
       
		System.out.println("Nhap ten sv: ");
		sv.setTen(sc.nextLine());
		System.out.println("Tuoi:");
		sv.setTuoi(sc.nextInt());
		System.out.println("Gioi Tinh: ");
		sv.setGioiTinh(character);
		System.out.println("Lop:");
		sv.setLop(sc.nextLine());
		System.out.println("Nganh:");
		sv.setNganh(sc.nextLine());
		System.out.println("---Truong--");
		System.out.println("Ten:");
		trg.setTen(sc.nextLine());
		System.out.println("Dia chi:");
		trg.setDiaChi(sc.nextLine());
		System.out.println("Hieu truong: ");
		trg.setHieuTruong(sc.nextLine());
		sv.setTruong(trg);

		System.out.println("Ten sv: " + sv.getTen());
		System.out.println("Tuoi :" + sv.getTuoi());
		System.out.println("Gioi tinh:" + sv.getGioiTinh());
		System.out.println("Lop: " + sv.getLop());
		System.out.println("Nganh:" + sv.getNganh());
		System.out.println("--Truong---");
		System.out.println("Ten:" + sv.getTruong().getTen());
		System.out.println("Dia chi:" + sv.getTruong().getDiaChi());
		System.out.println("Hieu Truong" + sv.getTruong().getHieuTruong());
	}
	public static void main(String[] args) {
		Man m=new Man();
		m.menu();
		
	}
}
