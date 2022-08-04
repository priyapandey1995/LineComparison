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

public class LineComparison {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * UC-1 Taking the inputs from the user and to calculate the length of a line
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparision Computation");
		
		System.out.println("Enter the value for x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the value for x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the value for y1");
		int y1 = sc.nextInt();
		System.out.println("Enter the value for y2");
		int y2 = sc.nextInt();

		
		
		double distanceOfLine1 = (Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
		System.out.println("The length of  Line i.e (x2-x1)+(y2-y1) = " + distanceOfLine1);
		
		 sc.close();
	}
		  

}
