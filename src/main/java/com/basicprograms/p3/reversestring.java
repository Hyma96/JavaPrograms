package com.basicprograms.p3;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr:");
		String s=sc.next();
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
							
				str=str+s.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
