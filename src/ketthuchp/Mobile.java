package ketthuchp;

import java.util.Scanner;

public class Mobile extends Product {
	protected String hangSX;
	protected String ram;
	public double getTotalPrice() {
		return total*price;
	}
	public Mobile() {
		super();
	}
	public Mobile(String id, String name, double price, int total,String hangSX, String ram) {
		super(id,name,price,total);
		this.hangSX = hangSX;
		this.ram = ram;
	}
	public String getHangSX() {
		return hangSX;
	}
	public String getRam() {
		return ram;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [hangSX=" + hangSX + ", ram=" + ram + "]";
	}
	public void nhapMobile() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap hang sx");
		hangSX = sc.nextLine();
		System.out.println("Nhap ram san pham");
		ram= sc.nextLine();
	}

}
