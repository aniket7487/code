package com.basic.array;

public class LeftRotationArray {

	public static void main(String[] args) {

		int a[]=new int[] {1,2,3,4,5};
		int d=4;
		int round=0;
		int tmp=0;
        for(int i=0;i<d;i++){
            if(round<d){
                for(int j=0;j<a.length-1;j++){
                	tmp=a[j];
                	a[j]=a[j+1];
                	a[j+1]=tmp;
                }
                round++;
            }
        }
        for(int i=0;i<a.length;i++){
        System.out.println("Array"+ a[i]);
        }
	}

}
