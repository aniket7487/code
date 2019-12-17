package com.basic.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		String strarr[]=str.split("\\s");
		
		System.out.println(" ");
		for(int i=strarr.length-1;i>=0;i--) {
			System.out.print(strarr[i]);
		}
	}
}
