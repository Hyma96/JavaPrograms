package com.basicprograms.p3;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year");
      int n=sc.nextInt();
      if(n%400==0 && n%100 !=0 || n%4==0) {
    	  System.out.println("given year is leap year");
      }
      else {
    	  System.out.println("given year is not leap year");
    	  
      }
	}

}
