package com.te.BasicCore.Day1Assignment;

public class UserMaincode5 {
	
	public static int countSeven(int num)
	{
		int rem, count=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==7)
			{
				count++;
			}
			num=num/10;
		}
		return count;
	}

}
