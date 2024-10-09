package com.arraysPrograms.p4;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c=0;
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,2,3,5,4,2,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				c+=1;
				System.out.println(" duplicate values :"+arr[j]);
				}

}
			
		}
		System.out.println("count of dupilcates: "+c);
}
	}
