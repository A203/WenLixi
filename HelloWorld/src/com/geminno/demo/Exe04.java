package com.geminno.demo;

import java.util.Scanner;

public class Exe04 {
	public static class Student{
		String name;
		int    score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("please insert a number");
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    Student[] student=new Student[100];
    for(int i=0;i<=50;i++){
    	student[i]=new Student();
    }
    switch(number)
    {
    case 1:System.out.println("����һ��ѧ��");break;
    case 2:System.out.println("�������ѧ����Ϣ");break;
    case 3:System.out.println("�������");break;
    default:System.out.println("�������");
    }
	}

}
