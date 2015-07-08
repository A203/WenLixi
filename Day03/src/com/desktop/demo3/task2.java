package com.desktop.demo3;

public class task2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}
}
class Person{
	String name;
	int age;
	String address;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public Person(String name,int age,String address){
		
	   this(name,age);
		this.name=name;
		this.age=age;
}}