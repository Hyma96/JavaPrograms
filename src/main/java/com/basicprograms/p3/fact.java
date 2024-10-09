package com.basicprograms.p3;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter");
      int n=sc.nextInt();
      int fact =1;
      for(int i=1;i<=n;i++) {
    	  fact=fact*i;
      }
      System.out.println(fact);
	}

}
