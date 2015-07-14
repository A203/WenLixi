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
    case 1:System.out.println("增加一个学生");break;
    case 2:System.out.println("输出所有学生信息");break;
    case 3:System.out.println("程序结束");break;
    default:System.out.println("输入错误");
    }
	}

}
