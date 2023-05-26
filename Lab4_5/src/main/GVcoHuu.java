package main;

import java.util.Scanner;

public class GVcoHuu extends GiangVien {
	private int luongThang;
	private int luongCB;
	private int heSo;
	private int phuCap;

	public GVcoHuu() {
		super();
		this.luongThang = 0;
		this.luongCB = 0;
		this.heSo = 0;
		this.phuCap = 0;
	}

	public void tinhLuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap luongCB: ");
		luongCB = sc.nextInt();
		System.out.println("Moi ban nhap he so: ");
		heSo = sc.nextInt();
		System.out.println("Moi ban nhap thâm niên công tác: ");
		int tn = sc.nextInt();
		if (tn < 5) {
			phuCap = (0 * luongCB) / 100;
			luongThang = luongCB * heSo + phuCap;
			System.out.println("Luong thang="+luongThang);
		} else if (tn == 5) {
			phuCap = (5 * luongCB) / 100;
			luongThang = luongCB * heSo + phuCap;
			System.out.println("Luong thang="+luongThang);
		} else if (tn>5){
			phuCap = (tn * luongCB) + phuCap;
			luongThang = luongCB * heSo + phuCap;
			System.out.println("Luong thang="+luongThang);
		}

	}
}
