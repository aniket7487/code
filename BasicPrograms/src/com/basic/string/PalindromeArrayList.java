package com.basic.string;

import java.util.ArrayList;
import java.util.List;

public class PalindromeArrayList {

	public static void main(String args[]){
		List<String> strList= new ArrayList<>();
		strList.add("N");
		strList.add("I");
		strList.add("T");
		strList.add("I");
		strList.add("N");
		
		System.out.println("Original String"+ strList);
		int start=0;
		int end=strList.size()-1;
	/*	for(int i=strList.size()-1;i>=0 ; i--){
			System.out.println(strList.get(i));
		}*/
		boolean flag=false;
		for(int i =0 ; i < strList.size();i++){
			System.out.println(strList.get(start)+" ----  "+strList.get(end));
			if(strList.get(start).toString()==(strList.get(end).toString())){
				start++;
				end--;
				flag=true;
				if(start==end){
					flag=true;
					break;
				}
			}
			else{
				flag=false;
				break;
			}
			
		}
		if(flag){
			System.out.println("String Palindrome");
		}else{
			
			System.out.println("String not Palindrome");
		}
	}
}
