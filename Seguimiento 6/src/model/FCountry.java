package model;

public class FCountry implements Comparable<FCountry>
{
private String name;
	
	private int goldMedals;
	private int silverMedals;
	private int bronzeMedals;
	
	public FCountry(String name, int gm, int sm, int bm)
	{
		this.name = name;
		goldMedals = gm;
		silverMedals = sm;
		bronzeMedals = bm;
	}
	
	

	public int getGoldMedals() {
		return goldMedals;
	}



	public void setGoldMedals(int goldMedals) {
		this.goldMedals = goldMedals;
	}



	public int getSilverMedals() {
		return silverMedals;
	}



	public void setSilverMedals(int silverMedals) {
		this.silverMedals = silverMedals;
	}



	public int getBronzeMedals() {
		return bronzeMedals;
	}



	public void setBronzeMedals(int bronzeMedals) {
		this.bronzeMedals = bronzeMedals;
	}



	@Override
	public int compareTo(FCountry obj)
	{
		int comparable;
		
		comparable = this.goldMedals - obj.goldMedals;
				
		if((this.goldMedals - obj.goldMedals) == 0)
		{
			comparable = this.silverMedals - obj.silverMedals;
			
			if((this.silverMedals - obj.silverMedals) == 0)
			{
				comparable = this.bronzeMedals - obj.bronzeMedals;
			}
		}
		
		return comparable;
	}
	
	public String toString()
	{
		return name + " " + goldMedals + " " + silverMedals + " " + bronzeMedals;
	}
}
