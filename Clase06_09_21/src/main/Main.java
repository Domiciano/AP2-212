package main;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		selectionMethod();
	}
	
	public static void selectionMethod()
	{
		ArrayList<Integer> arreglo = new ArrayList<>();
		
		arreglo.add(-4);
		arreglo.add(10);
		arreglo.add(22);
		arreglo.add(40);
		arreglo.add(-2);
		arreglo.add(-80);
		
		for(int i = 0 ; i < arreglo.size()-1 ; i++)
		{
			for(int j = i+1 ; j < arreglo.size() ; j++)
			{
				if(arreglo.get(i) > arreglo.get(j))
				{
					int a = arreglo.get(i);
					int b = arreglo.get(j);
					
					arreglo.set(i, b);
					arreglo.set(j, a);
				}
			}
		}
		
		for(int sum : arreglo)
		{
			System.out.println(sum);
		}
	}
	
	public static void bubbleMethod()
	{
		ArrayList<Integer> arreglo = new ArrayList<>();
		
		arreglo.add(50);
		arreglo.add(15);
		arreglo.add(-67);
		arreglo.add(15);
		arreglo.add(0);
		arreglo.add(-45);
		
		
		for(int i = arreglo.size(); i > 0 ; i--)
		{
			for(int j = 1 ; j < i ; j++)
			{
				if(arreglo.get(j) < arreglo.get(j-1))
				{
					int a = arreglo.get(j-1);
					int b = arreglo.get(j);
					
					arreglo.set(j-1, b);
					arreglo.set(j, a);
				}
			}
		}
		
		for(int sum : arreglo)
		{
			System.out.println(sum);
		}
	}
}
