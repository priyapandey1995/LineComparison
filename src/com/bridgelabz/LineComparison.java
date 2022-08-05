package com.bridgelabz;
/**
 * 
 */

import java.util.Scanner;
/**
 * 
 * @author pande
 *
 */
public class LineComparison{
	
	public static double inputsOfLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x1");
		double x1 = sc.nextDouble();
		
		System.out.println("Enter the value for x2");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter the value for y1");
		double y1 = sc.nextDouble();
		
		System.out.println("Enter the value for y2");
		double y2 = sc.nextDouble();
		
		double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return length;
	}
	public static void main(String[] args) {
		Double lengthOfLine1 = inputsOfLength();
		
		System.out.println("length of line 1 is" + lengthOfLine1);
		
		Double lengthOfLine2 = inputsOfLength();
		
		System.out.println("lenth of line two is"+lengthOfLine2);
		
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("both the lines are equal");
			}
			else {
			System.out.println("Both the lines are not equal");
			}
	
		
		
	}
	
}
		  


