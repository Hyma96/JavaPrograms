package com.basicprograms.p3;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.next();
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not a palindrom");
		}

	}

}
