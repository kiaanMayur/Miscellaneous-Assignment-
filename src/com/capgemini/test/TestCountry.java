package com.capgemini.test;
import java.util.*;

import com.capgemini.sample.Country;

/*a test class to test the country class*/
public class TestCountry {
	
	// method to check which country has the max population
	public static Country maxPopulation(Country[] country) {
				
		if((country[0].getCountryPopulation() > country[1].getCountryPopulation()) && country[0].getCountryPopulation() > country[2].getCountryPopulation() ) {
			
			return country[0];
					
				}
		
		else if((country[1].getCountryPopulation() > country[0].getCountryPopulation()) && country[1].getCountryPopulation() > country[2].getCountryPopulation() )
			return country[1];
		
		else
			return country[2];
				
	}
	
	// method to check which country has the max area
	public  static Country maxArea(Country[] country) {
		
		if((country[0].getCountryArea() > country[1].getCountryArea()) && country[0].getCountryArea() > country[2].getCountryArea() ) {
			
			return country[0];
					
				}
		
		else if((country[1].getCountryArea() > country[0].getCountryArea()) && country[1].getCountryArea() > country[2].getCountryArea() )
			return country[1];
		
		else
			return country[2];			
	}
	// method to check which country has the max density
	public  static Country maxDensity(Country[] country) {
		
		double firstDensity = country[0].getCountryDensity(country[0].getCountryPopulation(), country[0].getCountryArea());
		double secondDensity = country[0].getCountryDensity(country[0].getCountryPopulation(), country[0].getCountryArea());
		double thirdDensity = country[0].getCountryDensity(country[0].getCountryPopulation(), country[0].getCountryArea());
		
		if(firstDensity > secondDensity && firstDensity > thirdDensity)
			return country[0];
		
		else if(firstDensity < secondDensity && secondDensity > thirdDensity)
			return country[1];
		
		else
			return country[0];				
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// instantiating the object of country class which is an array
		Country[] countries = new Country[3];
		countries[0] = new Country();
		countries[1] = new Country();
		countries[2] = new Country();
		String [] countriesName = new String[3];
		int [] countriesPopulation = new int[3];
		double [] countriesArea = new double[3];
		int i;
		
		System.out.println("Enter the details below:\n");
		
		for(i = 0; i < 3; i++) {
			
			System.out.println("Enter the country name:\n");
			countriesName[i] = scanner.next();
			countries[i].setCountryName(countriesName[i]);
			
			System.out.println("Enter the country population:\n");
			countriesPopulation[i] = scanner.nextInt();
			countries[i].setCountryPopulation(countriesPopulation[i]);
			
			System.out.println("Enter the country area:\n");
			countriesArea[i] = scanner.nextDouble();
			countries[i].setCountryArea(countriesArea[i]);
			
		}
		
		System.out.println("country with max Population: " + maxPopulation(countries).getCountryName());
		System.out.println("\ncountry with max Area: " + maxArea(countries).getCountryName());
		System.out.println("\ncountry with max Density: " + maxDensity(countries).getCountryName());
	}
}
