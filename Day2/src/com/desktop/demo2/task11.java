package com.desktop.demo2;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("请输入一个1-100之间的数字");
    Scanner scanner=new Scanner(System.in);
    int c=scanner.nextInt();
    for (int i=1;i<=c;i++)
    {
       for(int j=c;j<0;j--)
      {
    	System.out.print(" ");
      }
       for(int k=0;k<=2*i-1;k++)
       {
    	   System.out.print(c);
       }
    }
}

}
