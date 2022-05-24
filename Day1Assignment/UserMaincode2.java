package com.te.BasicCore.Day1Assignment;

public class UserMaincode2 {
	
	static int sumOfSquaresOfEvenDigits(int num)
	{ int rem=0,sq=0,res=0;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sq=rem*rem;
			}
			res=res+sq;
			num=num/10;
			sq=0;
		}
		return res;
	}
}