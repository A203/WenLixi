package com.desktop.demo2;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //��whileѭ���﷨�ҳ�1-100�����������
		int k=0;int a=1;int j=1;
		while(a<=100)
		{
		  while(j<=a)
			   {
			      if(a%j==0)
			        {k++;}
			      j++;
			   }
		    if(k<=2)
		    {
			System.out.println(a);
			}
			k=0;
			j=1;
			a++;
		}
		}
	}


