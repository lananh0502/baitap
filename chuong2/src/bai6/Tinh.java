package bai6;

import java.util.Scanner;

public class Tinh {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Tong la: "+ (x+y));
		System.out.println("Hieu la: "+ (x-y));
		System.out.println("Tich la: "+ (x*y));
		System.out.println("Thuong la: "+(x/y));
	}

}
