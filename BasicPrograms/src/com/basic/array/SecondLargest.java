package com.basic.array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		int secMax=0,max=0;
		Scanner sc=new Scanner(System.in);
		int noElement= sc.nextInt();
		int arr[]=new int[noElement];
		for(int i=0;i<noElement;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			}else if(arr[i]<max && arr[i]> secMax) {
				secMax=arr[i];
			}
		}
		System.out.println("Max:" + max + "Second Max: "+ secMax);
	}

}
