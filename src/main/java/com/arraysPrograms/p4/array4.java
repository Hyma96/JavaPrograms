package com.arraysPrograms.p4;
import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter school number:");
      int sch=sc.nextInt();
      System.out.println("enter class number:");
      int cls=sc.nextInt();
      System.out.println("enter student number:");
      int stu=sc.nextInt();
      String arr[][][]=new String[sch][cls][stu];
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter school number"+(i+1));
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("enter class name"+(j+1));
    		  for(int k=0;k<arr[i][j].length;k++) {
    	    	  System.out.println("enter student number"+(k+1));
    		  arr[i][j][k]=sc.next();
    	  }
    	  }
      }
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("inside school number"+(i+1));
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("the cls no:"+(j+1));
    		  for(int k=0;k<arr[i][j].length;k++) {
    			  System.out.println("student is:"+(k+1)+" is:"+arr[i][j][k]);
    		  }
    	  }
      }
      }
	

}
