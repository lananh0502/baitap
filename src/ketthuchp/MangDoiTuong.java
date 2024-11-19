package ketthuchp;

public class MangDoiTuong implements MobileManager{
	private Mobile[] mobiles;
	private int count;
	public MangDoiTuong(int size)
	{
		mobiles = new Mobile[size];
		count ++;
	}
	//ArrayIndexOutOfBoundsException
	public void addMobile(Mobile m)
	{
		mobiles[count++] = m;
	}
	public void delMobile(Mobile m)
	{
		for(int i = 0; i < count; i++)
		{
			if(mobiles[i].equals(m))
			{
				mobiles[i] = mobiles[--count];
				mobiles[count] = null;
				break;
			}
		}
	}
	public void search(String name)
	{
		for(int i = 0; i < count; i++)
		{
			if(mobiles[i].getName().equals(name))
			{
				System.out.println(mobiles[i].toString());
			}
		}
	}
	public void getTotalStorage()
	{
		
	}
	@Override
	public void searchMobile(String name) {
		// TODO Auto-generated method stub
		
	}
	
}


