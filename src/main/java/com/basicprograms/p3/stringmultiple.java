package com.basicprograms.p3;

import java.util.Scanner;

public class stringmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter:");
        String res="";
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch = '\0'; // Initialize ch with a default value
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ch = s.charAt(i);
                if (num != 0) {
                    res += (char) (ch * num);
                    num = 0; // Reset num after using it
                }
            } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                num = s.charAt(i) - '0'; // Convert ASCII value to actual digit value
            }
        }
        System.out.println(res);
    }
}
