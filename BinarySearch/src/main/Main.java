package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	static ArrayList<Integer> array = new ArrayList<>();
	
	public static void main(String[] args)
	{
		array.add(41);
		array.add(29);
		array.add(-40);
		array.add(2);
		array.add(142);
		array.add(-22);
		array.add(37);
		array.add(-7);
		array.add(91);
		array.add(-1);
		
		Collections.sort(array);
		
		for( int s : array)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");
		
		binarySearch(38);
	}
	
	public static void binarySearch(int find)
	{
		int start = 0;
		int end = array.size()-1;
		
		boolean check = false;
		
		while(end - start > -1)
		{
			int half = (start+end)/2;
			
			if(array.get(half) == find)
			{
				System.out.println("Found: " + array.get(half));
				check = true;
				break;
			}else if(array.get(half) < find)
			{
				start = half + 1;
			}else if(array.get(half) > find)
			{
				end = half - 1;
			}
		}
		
		if(!check)
		{
			System.out.println("Couldn't find " + find + " in the array");
		}
	}
	
}
