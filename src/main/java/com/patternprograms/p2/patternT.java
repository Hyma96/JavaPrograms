package com.patternprograms.p2;

import java.util.Scanner;

class patternT

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++) {
        		if((i==0 && j<=n/2) || (j==n/4)){
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