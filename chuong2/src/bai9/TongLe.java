package bai9;

public class TongLe {
	public static void main(String[] args) {
		int tong =0;
		for(int i=0; i<100;i++) {
			if(i%2!=0) {
				tong+=i;
			}
		}
		System.out.println("Tổng số lẻ từ 1 đến 100 là: "+tong);
	}

}
