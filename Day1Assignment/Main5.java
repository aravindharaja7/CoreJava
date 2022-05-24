package com.te.BasicCore.Day1Assignment;

import java.util.Scanner;

public class Main5{
	
	public static void main(String[] args) {
		int num;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number : ");
		num= s.nextInt();
		int res=UserMaincode5.countSeven(num);
		System.out.println("The Count of Seven is "+res);
	}

}


