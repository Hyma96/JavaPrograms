package com.arraysPrograms.p4;
import java.util.Scanner;

public class hackerrankarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter langauages:");
      int lang=sc.nextInt();
      System.out.println("enter categories:");
      int cat=sc.nextInt();
      System.out.println("enter movies count:");
      int mov=sc.nextInt();
      Long arr[][][]=new Long[lang][cat][mov];
      long overall_collection=0;
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("enter langaues number"+(i+1));
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("enter category number"+(j+1));
    		  for(int k=0;k<arr[i][j].length;k++) {
        		  System.out.println("enter collection of movie number"+(k+1));
    		  arr[i][j][k]=sc.nextLong();
    	  }
    	  }
      }
    	  for(int i=0;i<arr.length;i++) {
        	  System.out.println("***** langaues number"+(i+1)+"*******");
        	  for(int j=0;j<arr[i].length;j++) {
        		  System.out.println("******* category number"+(j+1)+"********");
        		  for(int k=0;k<arr[i][j].length;k++) {
            		  System.out.println("the collection of movie number"+(k+1)+"is"+arr[i][j][k]);
            		  overall_collection = overall_collection + arr[i][j][k];
        		  }
        	  }
    	  }
    	  if(overall_collection > 600000000l) {
    		  System.out.println("suraj got the profit.");
    		  System.out.println("the profit made by surja is:"+(overall_collection- 600000000l));
    	  }
    	  else {
    		  System.out.println("surja got loss.");
    		  System.out.println("the loss incurd surja is :"+(600000000l-overall_collection));
    	  }
      }
      }
	


