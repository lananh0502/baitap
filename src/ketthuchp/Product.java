package ketthuchp;

import java.util.Scanner;

public abstract class Product {
	
	protected String id;
	protected String name;
	protected double price;
	protected int total;
	public Product() {
		
	}
	public Product(String id, String name, double price, int total) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getTotal() {
		return total;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", total=" + total + "]";
	}
	public void nhapProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap id san pham");
		id=sc.next();
		System.out.println("Nhap ten san pham");
		name=sc.next();
		System.out.println("Nhap gia san pham");
		price=sc.nextDouble();
		System.out.println("Nhap so luong san pham");
		total=sc.nextInt();
		
		
	}
	
		

}
