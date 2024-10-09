package com.basicprograms.p3;
import java.lang.Math;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter");
       int n=sc.nextInt();
       int len=0;
       int temp=0;
       int rev=0;
       while(n>0) {
    	   len++;
    	   n=n/10;
    	   }
       while(n>0) {
    	   int rem=n%10;
		 rev=rem^len;//rev=(int)Math.pow(2,3);
    	   n=n/10;
       }
       if(temp==rev) {
    	   System.out.println("amstrong");
       }
       else {
    	   System.out.println("not amstrong");
       }
      
	}

}

