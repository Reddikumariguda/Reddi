package com.k7it.java.lang;

public class StringArray {
    // String str="abcacbefd";
    // String[] str1=str.split(" ");
	public static void main(String[] args) {
		String str="Hello";
		String str1="";
		for(int i=0;i<str.length();i++) {
			String str2=" "+str.charAt(i);
			if(str1.contains(str2)) {
				continue;
			}
			else {
				str1 += str2;
				//System.out.println(str1);
			}
			//count(str.charAt(i));
			System.out.println(str2);
			
		}
		

	}

}
