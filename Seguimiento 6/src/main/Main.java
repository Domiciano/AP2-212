package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import model.FCountry;
import model.MCountry;

public class Main
{
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<MCountry> mCountries = new ArrayList<>();
	private static ArrayList<FCountry> fCountries = new ArrayList<>();
	private static ArrayList<FCountry> combCountries = new ArrayList<>();
	
	public static void main(String[] args)
	{
		int countryQ;
		
		System.out.println("Type in how many countries are there going to be: ");
		countryQ = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < countryQ ; i++)
		{
			String input;
			
			MCountry newMCountry;
			FCountry newFCountry;
			FCountry newCombCountry;
			
			System.out.println("Type in the name of the country followed by its gold, silver and bronze medals (In that order, first male, then female medals) divided by ';'' ");
			input = sc.nextLine();
			
			String[] data = input.split(";");
			
			String name = data[0];
			
			int goldMMedals = Integer.parseInt(data[1]);
			int goldFMedals = Integer.parseInt(data[4]);
			int silverMMedals = Integer.parseInt(data[2]);
			int silverFMedals = Integer.parseInt(data[5]);
			int bronzeMMedals = Integer.parseInt(data[3]);
			int bronzeFMedals = Integer.parseInt(data[6]);
			
			newMCountry = new MCountry(name, goldMMedals, silverMMedals, bronzeMMedals);
			newFCountry = new FCountry(name, goldFMedals, silverFMedals, bronzeFMedals);
			newCombCountry = new FCountry(name, goldMMedals + goldFMedals, silverMMedals + silverFMedals, bronzeMMedals + bronzeFMedals);
			
			mCountries.add(newMCountry);
			fCountries.add(newFCountry);
			combCountries.add(newCombCountry);
		}
		
		Collections.sort(mCountries);
		
		for(int i = 0 ; i < mCountries.size() ; i++)
		{
			System.out.println(mCountries.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		Collections.sort(fCountries);
		
		for(int i = 0 ; i < fCountries.size() ; i++)
		{
			System.out.println(fCountries.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		selectionSort(combCountries);
		
		for(int i = 0 ; i < combCountries.size() ; i++)
		{
			System.out.println(combCountries.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		insertionSort(combCountries);
		
		for(int i = 0 ; i < combCountries.size() ; i++)
		{
			System.out.println(combCountries.get(i).toString());
		}
	}
	
	public static void selectionSort(ArrayList<FCountry> countries)
	{
		for(int i = 0 ; i < countries.size() ; i++)
		{
			for(int j = i+1 ; j < countries.size() ; j++)
			{
				if(countries.get(i).getGoldMedals() < countries.get(j).getGoldMedals())
				{
					FCountry countryA = countries.get(i);
					FCountry countryB = countries.get(j);
					
					countries.set(i, countryB);
					countries.set(j, countryA);
				}
			}
		}
	}
	
	public static void insertionSort(ArrayList<FCountry> countries)
	{
		for(int i = 1 ; i < countries.size() ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(countries.get(i).getGoldMedals() > countries.get(j).getGoldMedals())
				{
					FCountry countryA = countries.get(i);
					
					countries.remove(i);
					countries.add(j, countryA);
				}
			}
		}
	}
}
