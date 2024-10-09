package com.arraysPrograms.p4;
import java.util.Scanner;

public class array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the school count:");
      int sch=sc.nextInt();
      int arr[][][]=new int[sch][][];
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter the class count inside the school"+(i+1));
    	  arr[i] =new int[sc.nextInt()][];
      }
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter school"+(i+1));
    	  for(int j=0;j<arr[i].length;j++) {
        	  System.out.println("enter student count"+(j+1));
    	  arr[i][j]= new int[sc.nextInt()];
      }
      }
     
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter school"+(i+1));
    	  for(int j=0;j<arr.length;j++) {
        	  System.out.println("enter school"+(j+1));
        	  for(int k=0;k<arr.length;k++) {
            	  System.out.println("enter school"+(j+1));
    	  arr[i][j][k]=sc.nextInt();
    	  }
    	  }
      }
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter school"+(i+1));
    	  for(int j=0;j<arr.length;j++) {
        	  System.out.println("enter school"+(j+1));
        	  for(int k=0;k<arr.length;k++) {
            	  System.out.println("enter school"+(j+1)+"is"+arr[i][j][k]);
        	  }
    	  }
      }
	}
} 
      
 
    	 
        	
	


