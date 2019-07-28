package com.basic.pattern;

import java.util.Scanner;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row:");
		int row =sc.nextInt();
		System.out.println("Enter Coloumn:");
		int col =sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=row;j>i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
