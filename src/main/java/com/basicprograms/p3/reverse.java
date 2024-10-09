package com.basicprograms.p3;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter");
      int n=sc.nextInt();
      int rem=0;
     int rev=0;
      while(n !=0) {
    	  rem=n%10;
    	  rev=(rev*10)+rem;
    	  n=n/10;
      }
      System.out.println(rev);
	}

}
