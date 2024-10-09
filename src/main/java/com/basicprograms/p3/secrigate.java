package com.basicprograms.p3;

import java.util.Scanner;

public class secrigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter:");
         String s=sc.nextLine();
         String str_num="";
         String str_alpha="";
         String str_spl="";
         for(int i=0;i<s.length();i++) {
        	 if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
        		 
        		 str_alpha= str_alpha+s.charAt(i);
        	 }
        	 else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
        		 str_num=str_num+s.charAt(i);
        	 }
        	 else {
        		 str_spl=str_spl+s.charAt(i);
        	 }
         }
         System.out.println(str_alpha);
         System.out.println(str_num);
         System.out.println(str_spl);
	}

}
