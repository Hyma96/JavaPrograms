package com.basicprograms.p3;

import java.util.Scanner;

public class charfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter");
       String s=sc.nextLine();
       String str="";
       int word_count=0;
       int temp=0;
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)==' ') {
    		   word_count++;
    	   }
       }
       int count=word_count+1;
       String[] arr=new String[count];
       for(int i=s.length()-1;i>=0;i--) {
    	  if(s.charAt(i)==' ') {
    		  arr[temp]=str;
    		  temp++;
    		  str="";
    		  
    	  }
    	  else {
    		  str=str+s.charAt(i);
    	  }
    	  
       }
       arr[temp]=str;
       for(int i=arr.length-1;i>=0;i--) {
    	   System.out.print(arr[i]+" ");
       }
       
      
	}

}
