package com.desktop.demo2;

import java.util.Scanner;

public class task2 { 

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
   System.out.println("please insert a number");
   Scanner scanner=new Scanner(System.in);
   int day=scanner.nextInt();
   String daystring;
   switch(day)
   {
   case 1:daystring="monday";break;
   case 2:daystring="tuesday";break;
   case 3:daystring="wendesday";break;
   case 4:daystring="thursday";break;
   case 5:daystring="friday";break;
   case 6:daystring="saturday";break;
   case 7:daystring="sunday";break;
   default:daystring="erreo day";
   }
   System.out.println("today is "+daystring);
	}

}
