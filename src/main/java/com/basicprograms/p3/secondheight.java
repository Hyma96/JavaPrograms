package com.basicprograms.p3;

import java.util.Scanner;

public class secondheight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       int temp=0;
       int max=arr[0];
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    	   if(arr[i] > max) {
    		   temp=arr[i];
    	      arr[i]=arr[j];
    	        arr[j]=temp;
    	   }
    	   }
    	   
       }
       System.out.println("secondheihgst value :"+arr[2]);
       }
	}

