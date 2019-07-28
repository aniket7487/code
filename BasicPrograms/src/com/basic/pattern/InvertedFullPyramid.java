package com.basic.pattern;

import java.util.Scanner;

public class InvertedFullPyramid {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row:");
		int row =sc.nextInt();
		System.out.println("Enter Coloumn:");
		int col =sc.nextInt();
		
		for(int i=row;i>0;i--) {
			for(int j=0;j<(row-i);j++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
