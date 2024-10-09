package com.arraysPrograms.p4;

import java.util.Scanner;

public class evensum {

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
				sum+=arr[i];
		}
	        else {
				sum1+=arr[i];
				}
		}
	        System.out.println("even sum is:"+sum);
	        System.out.println("odd sum is:"+sum1);


	}
}

