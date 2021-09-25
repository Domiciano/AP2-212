package model;

public class MCountry implements Comparable<MCountry>
{
	private String name;
	
	private int goldMedals;
	private int silverMedals;
	private int bronzeMedals;
	
	public MCountry(String name, int gm, int sm, int bm)
	{
		this.name = name;
		goldMedals = gm;
		silverMedals = sm;
		bronzeMedals = bm;
	}

	@Override
	public int compareTo(MCountry obj)
	{
		int comparable;
		
		comparable = obj.goldMedals - this.goldMedals;
				
		if((this.goldMedals - obj.goldMedals) == 0)
		{
			comparable = obj.silverMedals - this.silverMedals;
			
			if((this.silverMedals - obj.silverMedals) == 0)
			{
				comparable = obj.bronzeMedals - this.bronzeMedals;
			}
		}
		
		return comparable;
	}
	
	public String toString()
	{
		return name + " " + goldMedals + " " + silverMedals + " " + bronzeMedals;
	}
}
