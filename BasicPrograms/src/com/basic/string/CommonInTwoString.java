package com.basic.string;

import java.util.Scanner;

public class CommonInTwoString {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1=sc.nextLine();
		System.out.println("Enter Second String:");
		String str2=sc.nextLine();
		char strArr1[]=str1.toCharArray();
		char strArr2[]=str2.toCharArray();
		
		for(int i=0;i<strArr1.length;i++){
			for(int j=0;j<strArr2.length;j++){
				if(strArr1[i]==strArr2[j]){
					count++;
					strArr2[j]=0;
					break;
				}
			}
		}
		System.out.println("Common character count:"+count);
	}

}
