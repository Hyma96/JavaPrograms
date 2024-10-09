package com.basicprograms.p3;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.next();
        String str="";
        int flag=0;
        for(int i=0;i<s.length();i++) {
        	str=str + (char)(s.charAt(i));
        	if(str.equals(s1)) {
        		flag=1;
        	}
        	
        }
       if(flag==1) {
    	   System.out.println("second string is their");
       }
       else {
    	   System.out.println("not their");
       }
	}

}
