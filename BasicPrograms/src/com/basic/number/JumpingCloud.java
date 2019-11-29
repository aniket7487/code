package com.basic.number;

import java.util.ArrayList;
import java.util.List;

public class JumpingCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int c[]=new int[] {0,0,1,0,0,1,0};
		int jump=0;
        int i=0;
        while(i != c.length){
        	if(i == c.length-1) {
        		break;
        	}
            if(i+2<=c.length-1 && c[i+2]!= 1){
                jump++;
                i=i+2;
                System.out.println("Jump 2 "+jump +"I "+ i );
            }
            else{
                if(i+1<= c.length-1 && c[i+1]!= 1){
                    jump++;
                    i++;
                    System.out.println("Jump 1 "+jump +"I "+ i);
                }
            }
        }
        System.out.println(jump);*/
		/*String s="ceebbcb";
		long n=817723l;
		long counts=0l;
		String str="";
        long count=0l;
        int len=s.length();
        if(len <=n){
            counts=n/len+1;
            System.out.println("counts "+ counts)
        }
        for(int i=0;i<counts;i++){
            str=str+s;
//            System.out.println("str length "+ str);
        }
        for(int i=0;i<str.length();i++){
            if(i< n && str.charAt(i)=='a'){
                count++;
            }
        }*/
		
		/*int arr[][]={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};   
		int sum=0;
		System.out.println("len "+ arr.length);
        for(int i=0;i<arr[0].length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                arr[i][j]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.println("Arr Sum " + arr[i][j]);
            }
        }
        sum=Integer.MIN_VALUE;
        for(int i=0;i<arr[0].length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                if(arr[i][j]>=sum)sum=arr[i][j];
            }
        }*/
		String s="I am using HackerRank to improve programming";
		String t="am HackerRank to improve";
		boolean flag=false;
		List <String>missingList=new ArrayList<>();
	    String str[]=s.split(" "); 
	    String str2[]=t.split(" ");
	    System.out.println("Max Sum " + str.length + ""+str2.length);
	    for(int i=0;i<str.length;i++){
	    	flag=false;
	    	for(int j=0; j < str2.length;j++) {
	    		if(str[i].equals(str2[j])){
	                str2[j]=null;
	                flag=true;
	            }
	    	}
	    	if(!flag) {
	    		missingList.add(str[i]);
                System.out.println("Max Sum " + str[i]);
	    	}
	    }
        System.out.println("Max Sum " + missingList.size());
	}

}
