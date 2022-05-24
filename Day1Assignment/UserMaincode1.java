package com.te.BasicCore.Day1Assignment;

public class UserMaincode1 {
		static int checkSum(int num)
		{
			int rem,sum=0;while(num>0)
			{
				rem=num%10;
				if(rem%2!=0) {
					sum=sum+rem;
					
				}
				num=num/10;
			}
			return sum%2;
			
			
		}

}
