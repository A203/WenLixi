package com.desktop.demo2;



public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //可以通过length属性获取数组的长度
	 //声明数组时，不能指定数组长度。
	int score[][]=new int[20][5];
	for(int i=0;i<20;i++)
	{
		for(int j=0;j<5;j++)
		{
			score[i][j]=(int)(Math.random()*100);
		}
	}
	System.out.print("         "+"C++"+"\t"+"JAVA"+"\t"+"Servlet"+"\t"+"JSP"+"\t"+"EJB");
	System.out.print("\n");
	for(int i=0;i<20;i++)
	{
		System.out.print("student"+(i+1)+"  ");
		for(int j=0;j<5;j++)
		{
			System.out.print(score[i][j]+"\t");
			
		}
		System.out.print("\n");
	}
	int[] total=new int[20];float[] ave=new float[20];
	for(int i=0;i<20;i++)
	{
		for(int j=0;j<5;j++)
		{
			total[i]=total[i]+score[i][j];
		}
		ave[i]=total[i]/5.0f;
	}
	System.out.println("               "+"total"+"\t"+"ave");
	for(int i=0;i<20;i++)
	{
		System.out.println("student"+(i+1)+"\t"+total[i]+"\t"+ave[i]);
	}
	}

}
