package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Thông tin một sinh viên
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap ten sinh vien ");
		String tenSinhVien = sc.nextLine();
		System.out.println("Ten Sinh Vien: " + tenSinhVien);
		
		System.out.println("Nhap ma sinh vien ");
		String maSinhVien = sc.nextLine();
		System.out.println("Ma sinh vien: " + maSinhVien);
		
		System.out.println("Nhap chung minh nhan dan ");
		int chungMinhNhanDan = sc.nextInt();
		System.out.println("Chung minh nhan dan: " + chungMinhNhanDan);
		
		System.out.println("Nhap ten lop ");
		String tenLop = sc.nextLine();
		System.out.println("Ten lop: " + tenLop);
		
		System.out.println("Nhap ten truong ");
		String tenTruong = sc.nextLine();
		System.out.println("Ten truong: " + tenTruong);
		
		System.out.println("Nhap diem trung binh ");
		float diemTrungBinh = sc.nextFloat();
		System.out.println("Diem trung binh: " + diemTrungBinh);
		
		
		//Thông tin công dân
		System.out.println(" Nhap ten cong dan ");
		String tenCongDan = sc.nextLine();
		System.out.println("Ten: " + tenCongDan);
		
		System.out.println(" Nhap dia chi ");
		String diaChi = sc.nextLine();
		System.out.println("Dia chi: " + diaChi);
		
		System.out.println("Nhap so dien thoai ");
		int soDienThoai = sc.nextInt();
		System.out.println("So dien thoai: " + soDienThoai);
		
		System.out.println("Nhap he so luong ");
		float heSoLuong = sc.nextFloat();
		System.out.println("He so luong: " + heSoLuong);
		
		
		//Thông tin một chiếc xe
		System.out.println(" Nhap ten chiec xe ");
		String tenXe = sc.nextLine();
		System.out.println("Ten: " + tenXe);
		
		System.out.println(" Nhap hang xe ");
		String hang = sc.nextLine();
		System.out.println("Hang: " + hang);
		
		System.out.println(" Nhap gia ");
		float gia = sc.nextFloat();
		System.out.println("Gia: " + gia);
		
		System.out.println(" Nhap mau son ");
		String mauSon = sc.nextLine();
		System.out.println("Mau son: " + mauSon);

	}

}
