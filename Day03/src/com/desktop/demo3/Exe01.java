package com.desktop.demo3;

public class Exe01 {
	public static class Student{
	int  num;
	String name;
	String add;
	void introduce(){
	System.out.println("my name is "+name+"\n"+"my address is "+add+"\n"+"my number is "+num);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student stu=new Student();
    stu.num=2012214310;
	stu.name="wenlixi";
    stu.add="12#703";
    stu.introduce();
	}

}
