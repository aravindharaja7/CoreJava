package com.te.BasicCore.Day1Assignment;

import java.util.Scanner;

public class Main2 {
	
	public static void main (String [] args) {
	
	Scanner scn = new Scanner (System.in);
	System.out.println("Enter the number :");
	int num = scn.nextInt();
	int res = UserMaincode2.sumOfSquaresOfEvenDigits(num);
	System.out.println("SumOfSquaresOfEvenDigits are "+res);
	
	}

 }
