package ketthuchp;

import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		MobileManagerIML mobiles = new MobileManagerIML();
		Mobile[] ds = new Mobile[9];
		for(int i = 0; i < 3; i++)
		{
			ds[i] = new Mobile();
			ds[i].nhapMobile();
			mobiles.addMobile(ds[i]);
		}
		mobiles.hien();
//		Mobile mb1 = new Mobile();
//		mb1.nhapMobile();
//		mobiles.delMobile(mb1);
		mobiles.find();
	}
}
