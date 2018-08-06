package com.stackroute.pe2;

public class Palin {
	
 public int compute(int num)
 {
	 int temp=num;
	 //int count=0;
	 int temp1;
	 int res=0;
	 while(num>0)
	 {
		 temp1=num%10;
		 res=res*10+ temp1;
		 num=num/10;
	 }
	 return res;
	 
}
}        