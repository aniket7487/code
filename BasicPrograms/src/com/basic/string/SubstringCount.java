package com.basic.string;

public class SubstringCount {

	public static void main(String[] args) {

		String str= "Geeks for geeks";
		String substr="eks";
		
		for(int i=0;i<str.length()-substr.length();i++) {
			int j;
			for(j=0;j<substr.length();j++) {
				if(str.charAt(i+j) != substr.charAt(j)) {
					break;
				}
			}
			if(substr.length()==j) {
				System.out.println("index"+i);
			}
		}
	}

}
