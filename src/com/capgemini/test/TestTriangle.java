package com.capgemini.test;

import java.util.Scanner;
import com.capgemini.sample.Triangle;

/*a test class which tests the Triangle class*/
public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Triangle testTriangle = new Triangle();
		boolean result;
		
		
		System.out.println("Enter the values of triangle: ");
		int base = scanner.nextInt();
		int height = scanner.nextInt();
		int hypotenus = scanner.nextInt();
		
//		checking the types of triangle 
		testTriangle.setBase(base);
		testTriangle.setHeight(height);
		testTriangle.setHypotenus(hypotenus);
		
		System.out.println("Enter your choice to check: \n1.Right angled triangle\n2.Scalen triangle\n3.Isosceles triangle\n4.Equilateral triangle\n");
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1: 
			if(testTriangle.isRight())
				System.out.println("It is a right angled triangle.");
			else
				System.out.println("It is not a right angled triangle.");
			break;
			
		case 2:
			if(testTriangle.isScaline())
				System.out.println("It is a scalen triangle");
			else
				System.out.println("It is not a scalen triangle.");
			break;
			
		case 3:
			if(testTriangle.isIsosceles())
				System.out.println("It is an isosceles triangle.");
			else
				System.out.println("It is not an isosceles triangle.");
			break;
			
		case 4:
			if(testTriangle.isEquilateral())
				System.out.println("It is an equilateral triangle.");
			else
				System.out.println("It is not an equilateral triangle.");
			break;
			
		default:
			System.out.println("Invalid choice");

			}		
		}
}
