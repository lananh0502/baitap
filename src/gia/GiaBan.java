package gia;

import java.util.Scanner;

public class GiaBan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập vào giá bán và phần trăm giảm giá
		System.out.print("Nhập vào giá bán của sản phẩm: ");
		double giaBan = sc.nextDouble();
		System.out.print("Nhập vào phần trăm giảm giá: ");
		double phanTramGiam = sc.nextDouble();

		// Tính giá bán sau khi giảm
		double tienGiam = giaBan * (phanTramGiam / 100);
		double giaSauGiam = giaBan - tienGiam;

		// Hiển thị giá bán sau khi giảm
		System.out.println("Giá bán sau khi giảm: " + giaSauGiam);

		sc.close();
	}

}
