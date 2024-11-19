package diem;

import java.util.Scanner;

public class DiemSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập vào điểm thi của sinh viên
		System.out.print("Nhập điểm thi của sinh viên (0-100): ");
		float diem = sc.nextFloat();

		// Hiển thị loại sinh viên
		if (diem >= 90 && diem <= 100) {
			System.out.println("Loại: A");
		} else if (diem >= 80 && diem < 90) {
			System.out.println("Loại: B");
		} else if (diem >= 70 && diem < 80) {
			System.out.println("Loại: C");
		} else if (diem >= 50 && diem < 70) {
			System.out.println("Loại: D");
		} else if (diem >= 0 && diem < 50) {
			System.out.println("Loại: F");
		} else {
			System.out.println("Điểm không hợp lệ. Vui lòng nhập điểm từ 0 đến 100.");
		}
		sc.close();
	}

}
