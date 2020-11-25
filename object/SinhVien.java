package com.cybersoft.java10.object;

import java.util.Scanner;

public class SinhVien {
	/* properties */
	Scanner scan = new Scanner(System.in);

	private String ten;
	private String maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	
	/* getters/ setters */
	public String getMaSV() {
		return maSV;
	}
	
	public String getTen() {
		return ten;
	}

	/* constructors */
	public SinhVien() {
		this.ten = "";
		this.maSV = "";
		this.diemToan = 0f;
		this.diemLy = 0f;
		this.diemHoa = 0f;
	}

	public SinhVien(String ten, String maSV, float diemToan, float diemLy, float diemHoa) {
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	/* methods */
	public void nhapThongTin() {
		System.out.print("Họ tên sinh viên: ");
		ten = scan.nextLine();
		System.out.print("Mã sinh viên: ");
		maSV = scan.nextLine();
		System.out.print("Điểm toán: ");
		diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm lý: ");
		diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm hóa: ");
		diemHoa = Float.parseFloat(scan.nextLine());
	}

	public void xuatThongTin() {
		System.out.println(String.format("%10s |", maSV) 
				+ String.format("%16s |", ten)
				+ String.format("%17.2f |", tinhDiemTrungBinh())
				+ String.format("%16s |", xepLoai()));
	}

	public float tinhDiemTrungBinh() {
		return (diemHoa + diemLy + diemToan) / 3;
	}

	public String xepLoai() {
		if (tinhDiemTrungBinh() >= 9)
			return "Xuất Sắc";
		if (tinhDiemTrungBinh() >= 8)
			return "Giỏi";
		if (tinhDiemTrungBinh() >= 7)
			return "Khá";
		if (tinhDiemTrungBinh() >= 6)
			return "TB Khá";
		if (tinhDiemTrungBinh() >= 9)
			return "Giỏi";
		return "Yếu";
	}

}
