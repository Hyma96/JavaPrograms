package com.basicprograms.p3;

import java.util.Scanner;

public class stringAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String s = sc.next();
		int ch=0;

		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			System.out.println(ch);
		}
		
	}
}
