package com.basic.number;

import java.util.Scanner;

public class SumOFNumber {

	public static void main(String args[]) {
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();

		while(num != 0 ) {
			ans+=num%10;
			num=num/10;
			
		}
		System.out.println("Sum:"+ans);
	}
}
