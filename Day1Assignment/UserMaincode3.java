package com.te.BasicCore.Day1Assignment;

public class UserMaincode3 {
	static int reverseNumber(int num)
	{
		int rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}


