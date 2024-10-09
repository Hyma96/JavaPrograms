package com.basicprograms.p3;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int count=1;
         for(int i=1;i<=n;i++) {
        	 int k=i;
         for(int j=1;j<=i;j++) {
        		System.out.print(k+" ");
        		k=k+n-j;
        	}
        	System.out.println(); 
         }
         
     
	}

}
