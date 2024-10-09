package com.basicprograms.p3;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr");
		String s=sc.next();
		s.toLowerCase();
		int Vowel_count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				Vowel_count++;
			}
		}
		System.out.println(Vowel_count);

	}

}
