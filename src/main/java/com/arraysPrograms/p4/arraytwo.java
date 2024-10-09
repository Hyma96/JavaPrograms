package com.arraysPrograms.p4;
import java.util.Scanner;

public class arraytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter cls number:");
      int cls=sc.nextInt();
      System.out.println("enter the student no:");
      int stu=sc.nextInt();
      String arr[][]=new String[cls][stu];
      for(int i=0;i<cls;i++) {
    	  System.out.println("enter class number"+(i+1));
    	  for(int j=0;j<stu;j++) {
    		  System.out.println("enter student name"+(j+1));
    		  arr[i][j]=sc.next();
    	  }
    	  }
      for(int i=0;i<cls;i++) {
    	  System.out.println("inside cls number"+(i+1));
    	  for(int j=0;j<stu;j++) {
    		  System.out.println("the name of the student no:"+(j+1)+"is="+arr[i][j]);
    	  }
      }
      }
	

}
