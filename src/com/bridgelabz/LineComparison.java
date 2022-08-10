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
public class  LineComparison{
	public static double lengthOfLine1,lengthOfLine2;
	static int result;
	
	/**
	 * taking user inputs 
	 * Calculating Lengths
	 */
	public  double inputsOfLength() {
		
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
		LineComparison line = new  LineComparison();
		Double lengthOfLine1 = line.inputsOfLength();
		
	    System.out.println("length of line 1 is" + lengthOfLine1);
		
		Double lengthOfLine2 = line.inputsOfLength();
		
		System.out.println("length of line 2 is"+ lengthOfLine2);
		System.out.println("euqal::"+ lengthOfLine1.equals(lengthOfLine2));
		result = Double.compare(lengthOfLine1, lengthOfLine2);
			if(result < 0 ) {
				System.out.println(  lengthOfLine1 +" is lesser than" + " " +lengthOfLine2);
			}
			else {
				System.out.println(lengthOfLine1 + "is greater than " + " " + lengthOfLine2);
		}
		
			
	

}
}
		  


