package bai11;

import java.util.Scanner;

public class HinhTron {
	public static final float PI=3.14f;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r= sc.nextFloat();
		System.out.println("Diện tích hình tròn: "+(PI*r*r));
		System.out.println("Chu vi  hình tròn: "+(2*PI*r));
	}

}
