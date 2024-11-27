package bai7;

import java.util.Scanner;

public class Nhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x, y;
		char z;
		x = sc.nextFloat();
		y = sc.nextFloat();
		z = sc.next().charAt(0);
		if (z == 'A') {
			System.out.println("Tổng là: " + (x + y));
		}
		else if(z=='S')
			System.out.println("Hiệu là:"+(x-y));
		else if(z=='M')
			System.out.println("Tích là: "+(x*y));
		else if(z=='D')
			System.out.println("Thương là: "+(x/y));
		else
			System.out.println("Ký tự nhập không hợp lệ");
	}

}
