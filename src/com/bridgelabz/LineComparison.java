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
	/**
	 * 
	 * @return
	 */
	
	public static double inputsOfLength() {
		/**
		 * taking user inputs 
		 * Calculating Lengths
		 */
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
		
		System.out.println("length of line 2 is"+ lengthOfLine2);
		
		
		/**
		 * UC-3 comparing two lines and checking which is greter or lesser
		 */
		if(lengthOfLine1.compareTo(lengthOfLine2) < 0 ) {
			System.out.println(  lengthOfLine1 +" is lesser than" + " " +lengthOfLine2);
		}
		else {
			System.out.println(lengthOfLine1 + " is greater than" + " " +lengthOfLine2);
		}
	
		
		
	}
	
}
		  


