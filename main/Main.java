package com.cybersoft.java10.main;

import com.cybersoft.java10.object.QuanLySinhVien;
import com.cybersoft.java10.object.SinhVien;

public class Main {

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		
		getDummyData(quanLySinhVien);
		quanLySinhVien.xuatDanhSachSinhVien();
		
		quanLySinhVien.themSinhVien(new SinhVien("Quân", "MS05", 7, 7, 9));
		quanLySinhVien.themSinhVien(new SinhVien("Quân", "MS06", 7, 8, 9));
		quanLySinhVien.xuatDanhSachSinhVien();
	}

	private static void getDummyData(QuanLySinhVien quanLySinhVien) {
		quanLySinhVien.themSinhVien(new SinhVien("Tuấn", "MS01", 5, 6, 9));
		quanLySinhVien.themSinhVien(new SinhVien("Hùng", "MS02", 8, 6, 9));
		quanLySinhVien.themSinhVien(new SinhVien("Hậu", "MS03", 5, 4, 3));
		quanLySinhVien.themSinhVien(new SinhVien("Thông", "MS04", 8.5f, 9, 10));
		quanLySinhVien.themSinhVien(new SinhVien("Linh", "MS05", 10, 10, 9.5f));
	}

}
