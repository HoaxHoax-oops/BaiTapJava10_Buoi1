package com.cybersoft.java10.object;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
	/* properties */
	List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	
	/* methods */
	public boolean xoaSinhVien(String maSV) {
		if("".equals(maSV))
			return false;
		
		return dsSinhVien.remove(timIndex(maSV));
	}
	
	private int timIndex(String maSV) {
		int index = -1;
		
		for (SinhVien sinhVien : dsSinhVien) {
			if(maSV.equals(sinhVien.getMaSV()))
				index = dsSinhVien.indexOf(sinhVien);
		}
		
		return index;
	}

	public boolean themSinhVien(SinhVien sinhVien) {
		if(sinhVien == null)
			return false;
		
		if("".equals(sinhVien.getMaSV()) || "".equals(sinhVien.getTen()))
			return false;
		
		if(kiemTraTrungMaSV(sinhVien.getMaSV()))
			return false;
		
		return dsSinhVien.add(sinhVien);
	}
	
	private boolean kiemTraTrungMaSV(String maSV) {
		for (SinhVien sinhVien : dsSinhVien) {
			if(sinhVien.getMaSV() == maSV)
				return true;
		}
		
		return false;
	}

	public void xuatDanhSachSinhVien() {
		int num = 34;
		String ttSinhVien = "DANH SÁCH SINH VIÊN";
		
		System.out.println();
		System.out.println(String.format("%" + (num*2 - ttSinhVien.length())/2 + "s", "") 
				+ ttSinhVien + String.format("%" + (num*2 - ttSinhVien.length())/2 + "s", ""));
		drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %10s  ", "Mã số")
				+ String.format("%16s ", "Họ tên")
				+ String.format("%17s  ", "Điểm trung bình")
				+ String.format("%16s |", "Xếp loại"));
		drawLine(num);
		System.out.println();
		for (SinhVien sinhVien : dsSinhVien) {
			sinhVien.xuatThongTin();
		}
		drawLine(num);
		System.out.println();
	}

	private void drawLine(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}
}
