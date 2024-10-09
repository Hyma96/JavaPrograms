package com.basicprograms.p3;

import java.util.Scanner;

public class Naturalby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int start=sc.nextInt();
		System.out.println("enter the second number:");
		int end=sc.nextInt();
		int sum=0;
	
		for(int i=start;i<=end;i++) {
			if(i%3==0) {
				sum+=i;
			}
		
		}
		System.out.println(sum);

	}

}