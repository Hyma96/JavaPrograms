package com.arraysPrograms.p4;
import java.util.Scanner;

public class arraycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n number:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  System.out.println("enter student marks"+(i+1));
    	  arr[i]=sc.nextInt();
    	  }
      for(int i=0;i<n;i++) {
    	  System.out.println("the marks of the students no"+(i+1)+"students marks:"+(arr[i]));
      }
      }
	

}
