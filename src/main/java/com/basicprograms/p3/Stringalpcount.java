package com.basicprograms.p3;

import java.util.Scanner;

public class Stringalpcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int alp=0;
        int num=0;
        int spl=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
        		alp=alp+1;
        	}
        	else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
        		num=num+1;
        	}
        	else {
        		spl=spl+1;
        	}
        }
        	System.out.println("alphabets count"+alp);
        	System.out.println("number count"+num);
        	System.out.println("spl count"+spl);
        
	}

}
