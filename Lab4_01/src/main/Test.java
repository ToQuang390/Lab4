package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			BenhNhan benhnhan = new BenhNhan();
			BenhVien benhvien = new BenhVien();
			System.out.println("Menu");
			System.out.println("1.Nhập");
			System.out.println("2.Xuất theo toString");
			System.out.println("3.Xuất theo Getter");
			System.out.println("0.Thoát");
			System.out.println("Nhập lựa chọn");
			String lc = sc.nextLine();
			switch (lc) {
			case "1":
				System.out.println("Tên: ");
				benhnhan.setTen(sc.nextLine());
				System.out.println("Tuoi: ");
				benhnhan.setTuoi(sc.nextInt());
				sc.nextLine();
				System.out.println("Gioi tinh:");
				benhnhan.setGioiTinh(sc.next().charAt(0));
				System.out.println("Tiền sử:");
				String ts=sc.nextLine();
				benhnhan.setTienSu(ts);
				sc.nextLine();
				System.out.println("Chuẩn Đoán: ");
				benhnhan.setChuanDoan(sc.nextLine());
				System.out.println("Tên bệnh viên");
				benhvien.setTen(sc.nextLine());
				System.out.println("Địa chỉ: ");
				benhvien.setDiaChi(sc.nextLine());
				System.out.println("Giám đốc:");
				benhvien.setGiamDoc(sc.nextLine());
				benhnhan.setBenhvien(benhvien);
				
				break;
			case "2":
				System.out.println(benhnhan);
				break;

			case "3":
				System.out.println("Tên: " + benhnhan.getTen());
				System.out.println("Tuổi:" + benhnhan.getTuoi());
				System.out.println("Giới Tính" + benhnhan.getGioiTinh());
				System.out.println("Tiền sử" + benhnhan.getTienSu());
				System.out.println("Chuẩn Đoán" + benhnhan.getChuanDoan());
				System.out.println("Tên Bệnh Viên:" + benhnhan.getBenhvien().getTen());
				System.out.println("Địa chỉ:" + benhnhan.getBenhvien().getDiaChi());
				System.out.println("Giám đốc: " + benhnhan.getBenhvien().getGiamDoc());
				break;
			}

		}

	}
}
