package com.basic.string;

public class UniqueNumber {

	public static void main(String[] args) {

		int arr[]=new int[]{1,2,4,6,3,2,3};
		int len=arr.length;
		for(int i = 0 ;i<len;i++){
			for(int j = i+1 ;j<len;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
			}
			if(arr[i] != 0 ){
				System.out.println(arr[i]);
			}
		}
	}

}
