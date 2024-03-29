package com.basic.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		char charArr[]=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch:charArr){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
		for(Map.Entry<Character,Integer> entry: entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
	}
}
