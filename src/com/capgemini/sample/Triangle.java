package com.capgemini.sample;

/*a sample class which contains following methods
 * isRight() -> checks if a triangle is right angled triangle or not
 * isScalen() -> checks if a triangle is scalen triangle or not (all sides are different)
 * isIsosceles() -> checks if a triangle is isosceles triangle or not (any two sides are equal)
 *  isEquilateral() -> checks if a triangle is equilateral triangle or not (all side are equal)
 * */
public class Triangle {
	
	private int base;
	private int hypotenus;
	private int height;
	
	public Triangle() {
		base = 1;
		hypotenus = 1;
		height = 1;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHypotenus() {
		return hypotenus;
	}

	public void setHypotenus(int hypotenus) {
		this.hypotenus = hypotenus;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean isRight() {
		
		if((base * base) + (height * height) == (hypotenus * hypotenus))
			return true;
		else
			return false;
	}
	
	public boolean isScaline() {
		
		if(base != hypotenus && hypotenus != height && base != height)
			return true;
		else 
			return false;
	}
	
	public boolean isIsosceles() {
		
		if(base == height && base != hypotenus)
			return true;
		else if(base == hypotenus && base != height)
			return true;
		else if(height == hypotenus && height != base)
			return true;
		else
			return false;
	}
	
	public boolean isEquilateral() {
		
		if(height == base && base == hypotenus)
			return true;
		else
			return false;			
	}
}
