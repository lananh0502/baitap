package bai10;

import java.util.Scanner;

public class HinhChuNhat {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float chieuDai = sc.nextFloat();
		float chieuRong=sc.nextFloat();
		System.out.println("Diện tich hcn: "+(chieuDai*chieuRong));
		System.out.println("Chu vi hcn: "+(2*(chieuDai+chieuRong)));
	}

}
