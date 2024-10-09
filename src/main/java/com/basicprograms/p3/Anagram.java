package com.basicprograms.p3;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter:");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
	   char[] t=a.toCharArray();
	   char[] s=b.toCharArray();
	   java.util.Arrays.sort(t);
	   java.util.Arrays.sort(s);
	   System.out.println(java.util.Arrays.equals(t,s)? "anagram" : "not a anagram");
		
		

	}

}
