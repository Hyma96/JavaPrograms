package com.patternprograms.p2;

import java.util.Scanner;

class patternQ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if((i==0 && j<3*n/4 && j!=0 && i!=(3*n/4) || (j==0 && i<=3*n/4 && i!=0 && i!=(3*n/4)) || (i==(3*n/4) && j<3*n/4 && j!=0 && j!=3*n/4) || (i==j && j>=n/2 ) || (j==3*n/4 && i!=0 && i<=3*n/4))){
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