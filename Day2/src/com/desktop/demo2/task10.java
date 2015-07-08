package com.desktop.demo2;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//答应三角形图案
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行数");
		int num= input.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
			 System.out.print(" ");	
			}
		   for(int j=1;j<=2*i-1;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		}
	}

}
