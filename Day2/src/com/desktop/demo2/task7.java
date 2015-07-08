package com.desktop.demo2;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //continue and  break
		//找出1-99中第一个被5整除的数
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				break;
			}
		}
		//打印1-99所有能被5整除的数并记录不符合要求的数字的个数
		int number=0;
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				continue;
	}
number++;
}
	System.out.println("number:"+number);	
	//找出1-100内的所有质数
	int k=0;
	for(int a=1;a<=100;a++)
	{
		{for(int j=1;j<=a;j++)
		   {if(a%j==0)
		     {k++;}	
		   }
		}
	    if(k<=2)
	    {
		System.out.println(a);
		}
		k=0;
	    
	}
	}
	}
