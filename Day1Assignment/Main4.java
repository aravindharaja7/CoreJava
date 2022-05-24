package com.te.BasicCore.Day1Assignment;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		String num=scn.next();
		int a=UserMaincode4.getUnique(num);
		if(a==1)
		{
			System.out.println("Given Number "+num+" is Unique");
		}
		else
		{
			System.out.println("Given Number "+num+" is Not Unique");
		}

	}

}