package com.arraysPrograms.p4;

import java.util.Scanner;

public class countarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value: ");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
	    	  System.out.println("enter elements"+(i+1));
	    	  arr[i]=sc.nextInt();
	    	  }
	       for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
				sum+=1;
		}
	        else {
				sum1+=1;
				}
		}
	        System.out.println("even numbers:"+sum);
	        System.out.println("odd numbers:"+sum1);


	}
}

