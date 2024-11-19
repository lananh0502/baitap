package ketthuchp;

import java.util.ArrayList;

public class MobileManagerIML implements MobileManager {
	private ArrayList<Mobile> mobiles;

	public MobileManagerIML() {
		mobiles = new ArrayList<>();
	}

	public void addMobile(Mobile m) {
		try {
			mobiles.add(m);
		} catch (NullPointerException e) {
			System.out.println("bi loi");
		}
	}

	public void delMobile(Mobile m) {
		mobiles.remove(m);
	}

	public void search(String name) {
		for (Mobile m : mobiles) {
			if (m.getName().equals(name)) {
				System.out.println(m.toString());
			}
		}
	}

	public void hien() {
		for (Mobile m : mobiles) {
			System.out.println(m.toString());
		}
	}

	public void find() {
		Mobile max = mobiles.get(0);
		for (Mobile m : mobiles) {
			if (m.getPrice() > max.getPrice()) {
				max = m;
			}
		}
		System.out.println(max.toString());
	}

	@Override
	public void searchMobile(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getTotalStorage() {
		// TODO Auto-generated method stub

	}

}
