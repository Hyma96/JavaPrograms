package com.basicprograms.p3;

import java.util.Scanner;

public class secondheighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		String A=sc.next();
		String B=sc.next();
		if(A.charAt(0) >= B.charAt(0)) {
		System.out.println("no");
		}
		else {
			System.out.println("yes");
	
		}
		System.out.println(A.charAt(0));
		System.out.println(A.toUpperCase().substring(0,1)+A.substring(1,A.length()));
		}
	}


