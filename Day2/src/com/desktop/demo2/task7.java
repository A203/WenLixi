package com.desktop.demo2;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //continue and  break
		//�ҳ�1-99�е�һ����5��������
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				break;
			}
		}
		//��ӡ1-99�����ܱ�5������������¼������Ҫ������ֵĸ���
		int number=0;
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				continue;
	}
number++;
}
	System.out.println("number:"+number);	
	//�ҳ�1-100�ڵ���������
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
