package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Giang Vien Co Huu");
			System.out.println("2.Giang Vien Thinh Giang");
			String lc = sc.nextLine();
			switch (lc) {
			case "1": {
				GiangVien gvch = new GVcoHuu();
				System.out.println("1.Nhap Thong Tin");
				System.out.println("2.In Thong Tin");
				int c = sc.nextInt();
				if (c == 1) {
					gvch.NhapThongTin();
				} else if (c == 2) {
					gvch.inThongTin();
				}
				break;
			}
			case "2": {
				GiangVien gvtg = new GiangVienThinhGiang();
				System.out.println("1.Nhap Thong Tin");
				System.out.println("2.In Thong Tin");
				int f=sc.nextInt();
				if (f == 1) {
					gvtg.NhapThongTin();
				} else if (f == 2) {
					gvtg.inThongTin();
				}
				break;
			}
			}
		}

	}
}