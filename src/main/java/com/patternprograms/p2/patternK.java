package com.patternprograms.p2;

import java.util.Scanner;

class patternK
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j==0 || i+j==n/2 && j<=n/2 || (i-j==n/2 && j<=n/2)){
        		System.out.print("* ");
        	}
        		else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println("  ");
        }
    }
}
