package com.te.BasicCore.Day1Assignment;

import java.util.Scanner;

public class Main1 {
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
		int sum= UserMaincode1.checkSum(num);
		if (sum==0)
		{
			System.out.println("Sum of Odd digits is even ");
		}
		else {
			System.out.println("Sum of odd digits is odd");
		}
	}

}
