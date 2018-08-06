package com.stackroute.pe2;

public class NumPow {

	public boolean checkpow(int n)
	{
	if(n%4==0)
	{
	  while(n != 1)
	  {    
	   if(n % 4 != 0)
		 break;
	   else
	    n = n / 4;      
	  }
	  return true;
	}
	else
	 return false;
	}
}