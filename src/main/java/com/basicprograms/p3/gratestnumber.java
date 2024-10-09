package com.basicprograms.p3;

import java.util.Scanner;

public class gratestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=end;i++) {
		for(int j=1;j<=end;j++) { 
				if(i%j==0) {
					sum=sum+i;
				
				}
	
			
			
		}
		}
		if(sum==2) {
			System.out.println(sum);
		}
		
		}
		

	}



