package com.capgemini.sample;

/*a sample class Country which contains services like finding the country density*/
public class Country {
	
	// insatnce members
	private String countryName;
	private int countryPopulation;
	private double countryArea;

	public Country() {

		countryPopulation = 10000;
		countryArea = 100;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	public double getCountryArea() {
		return countryArea;
	}

	public void setCountryArea(double countryArea) {
		this.countryArea = countryArea;
	}

	public double getCountryDensity(int countryPopulation, double countryArea) {
		
		return (countryPopulation / countryArea);
	}
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryPopulation=" + countryPopulation + ", countryArea="
				+ countryArea + "]";
	}
}
