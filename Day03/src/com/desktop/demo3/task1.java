package com.desktop.demo3;

import java.util.concurrent.Callable;

public class task1 {
	 public static class  Phone{
	 int   price;
	 String name;
	 String brand;
	 void call(){
	System.out.println("call");}
	 void sendmsg(){
		 System.out.println("send  messege"); 
	 }
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Phone p=new Phone();
    p.call();
    p.sendmsg();
    
	}

}
