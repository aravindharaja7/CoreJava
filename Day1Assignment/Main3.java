package com.te.BasicCore.Day1Assignment;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=s.nextInt();
		int res=UserMaincode3.reverseNumber(num);
		System.out.println("Reversed number is : "+res);
	}

}